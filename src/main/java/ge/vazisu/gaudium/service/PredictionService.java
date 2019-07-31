package ge.vazisu.gaudium.service;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.repository.PredictionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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

    public void updatePredictionInfo(int drawNumber) {
        predictionRepository.findAllByDrawNumber(drawNumber).forEach(draw ->
                {
                    Game game = gameService.findByDrawNumberAndHomeTeamNameAndAwayTeamName(drawNumber, draw.getHomeTeamName(), draw.getAwayTeamName());
                    predictionRepository.save(draw.setRefId(game.getId()));
                }
        );
    }
}
