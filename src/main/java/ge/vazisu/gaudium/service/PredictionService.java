package ge.vazisu.gaudium.service;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.domain.Prediction;
import ge.vazisu.gaudium.dto.PredictionStatDto;
import ge.vazisu.gaudium.dto.ResolvedGames;
import ge.vazisu.gaudium.enums.Criteria;
import ge.vazisu.gaudium.repository.PredictionRepository;
import ge.vazisu.gaudium.resolver.StatisticResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * PredictionService.
 *
 * @author Pavel_Datunashvili
 */
@Service
@AllArgsConstructor
public class PredictionService {

    private PredictionRepository predictionRepository;
    private GameService gameService;
    private StatisticResolver statisticResolver;

    public int updatePredictionInfo(int drawNumber) {
        List<Prediction> allByDrawNumber = predictionRepository.findAllByDrawNumber(drawNumber);
        allByDrawNumber.forEach(prediction ->
                {
                    Game game = gameService.findByDrawNumberAndHomeTeamNameAndAwayTeamName(drawNumber, prediction.getHomeTeamName(), prediction.getAwayTeamName());
                    predictionRepository.save(prediction.setRefId(game.getId()));
                }
        );
        return allByDrawNumber.size();
    }

    public PredictionStatDto getPredictionStat(String tournamentName, Criteria criteria) {

        List<Game> all = getPredictionsByTournamentNameAndCriteriaIn(null, criteria).stream()
                .map(Prediction::getRefId)
                .map(gameService::getGameById)
                .collect(Collectors.toList());

        List<Game> byTournament = getPredictionsByTournamentNameAndCriteriaIn(tournamentName, criteria).stream()
                .map(Prediction::getRefId)
                .map(gameService::getGameById)
                .collect(Collectors.toList());

        PredictionStatDto predictionStatDto = new PredictionStatDto();

        if (!all.isEmpty()) {
            ResolvedGames allResolvedGames = statisticResolver.resolveGames(all);
            predictionStatDto.setAllHome(allResolvedGames.getHome())
                    .setAllDraw(allResolvedGames.getDraw())
                    .setAllAway(allResolvedGames.getAway())
                    .setAllFonPool(allResolvedGames.getFonPool())
                    .setAllFonMiddle(allResolvedGames.getFonMiddle())
                    .setAllFonUnpool(allResolvedGames.getFonUnpool())
                    .setAllManPool(allResolvedGames.getManPool())
                    .setAllManMiddle(allResolvedGames.getManMiddle())
                    .setAllManUnpool(allResolvedGames.getManUnpool());
        }

        if (!byTournament.isEmpty()) {
            ResolvedGames allResolvedGamesByTournament = statisticResolver.resolveGames(byTournament);
            predictionStatDto.setTournamentHome(allResolvedGamesByTournament.getHome())
                    .setTournamentDraw(allResolvedGamesByTournament.getDraw())
                    .setTournamentAway(allResolvedGamesByTournament.getAway())
                    .setTournamentFonPool(allResolvedGamesByTournament.getFonPool())
                    .setTournamentFonMiddle(allResolvedGamesByTournament.getFonMiddle())
                    .setTournamentFonUnpool(allResolvedGamesByTournament.getFonUnpool())
                    .setTournamentManPool(allResolvedGamesByTournament.getManPool())
                    .setTournamentManMiddle(allResolvedGamesByTournament.getManMiddle())
                    .setTournamentManUnpool(allResolvedGamesByTournament.getManUnpool());
        }

        return predictionStatDto;
    }

    private List<Prediction> getPredictionsByTournamentNameAndCriteriaIn(String tournamentName, Criteria criteria) {
        return Objects.isNull(tournamentName) ? predictionRepository.findAllByCriteriaInAndRefIdIsNotNull(Collections.singleton(criteria))
                : predictionRepository.findAllByTournamentNameAndCriteriaInAndRefIdIsNotNull(tournamentName, Collections.singleton(criteria));
    }

}
