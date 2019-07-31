package ge.vazisu.gaudium.service;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.repository.GameRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * GameService.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@Service
@AllArgsConstructor
public class GameService {

    private GameRepository gameRepository;

    public Game findByDrawNumberAndHomeTeamNameAndAwayTeamName(int drawNumber, String homeTeamName, String awayTeamName) {
        Optional<Game> game = gameRepository.findByDrawNumberAndHomeTeamNameAndAwayTeamName(drawNumber, homeTeamName, awayTeamName);
        return game.orElseThrow(() -> new IllegalArgumentException("Update prediction info error"));
    }


    public List<Game> getGamesByTournamentName(String name, Pageable pageable) {
        return gameRepository.findAllByTournamentNameOrderByIdDesc(name, pageable);
    }

    public List<Game> getGamesByHomeTeamName(String tournamentName, String name, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndHomeTeamNameOrderByIdDesc(tournamentName, name, pageable);
    }

    public List<Game> getGamesByAwayTeamName(String tournamentName, String name, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndAwayTeamNameOrderByIdDesc(tournamentName, name, pageable);
    }


    public List<Game> getGamesByTeamName(String tournamentName, String name, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndHomeTeamNameOrAwayTeamNameOrderByIdDesc(tournamentName, name, pageable);
    }

    public List<Game> getGamesByHomeTeamNameAndAwayTeamName(String tournamentName, String homeTeamName, String awayTeamName, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndHomeTeamNameAndAwayTeamNameOrderByIdDesc(tournamentName, homeTeamName, awayTeamName, pageable);
    }

    public List<Game> getByFon(double fonHome, double fonDraw, double fonAway, Pageable pageable) {
        return gameRepository.findAllByFonHomeAndFonDrawAndFonAwayOrderByIdDesc(fonHome, fonDraw, fonAway, pageable);
    }

    public List<Game> getByFonAndTournament(String tournamentName, double fonHome, double fonDraw, double fonAway, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndFonHomeAndFonDrawAndFonAwayOrderByIdDesc(tournamentName, fonHome, fonDraw, fonAway, pageable);
    }

    public List<Game> getByMan(double manHome, double manDraw, double manAway, Pageable pageable) {
        return gameRepository.findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
                manHome - 0.5D, manHome + 0.5D,
                manDraw - 0.5D, manDraw + 0.5D,
                manAway - 0.5D, manAway + 0.5D, pageable);
    }

    public List<Game> getByManAndTournament(String tournamentName, double manHome, double manDraw, double manAway, Pageable pageable) {
        return gameRepository.findAllByTournamentNameAndManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
                tournamentName, manHome - 0.5D, manHome + 0.5D,
                manDraw - 0.5D, manDraw + 0.5D,
                manAway - 0.5D, manAway + 0.5D, pageable);
    }

    public List<Game> getPoolQueerness(String tournamentName, double fonHome, double fonAway, double manHome, double manAway, Pageable pageable) {
        if ((fonHome > fonAway) && (manHome < manAway)) {
            return gameRepository.findFonHomeAndManAwayQueerness(tournamentName, pageable);
        } else if ((fonHome < fonAway) && (manHome > manAway)) {
            return gameRepository.findFonAwayAndManHomeQueerness(tournamentName, pageable);
        }
        return Collections.emptyList();
    }
}
