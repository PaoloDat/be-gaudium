package ge.vazisu.gaudium.resource;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.dto.GameDto;
import ge.vazisu.gaudium.service.GameService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * MainController.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/game")
public class GameResourceImpl {

    private GameService gameService;
    private MapperFacade mapperFacade;

    @GetMapping("/tournament/{name}")
    public List<GameDto> getGamesByTournamentName(@PathVariable("name") String tournamentName,
                                                  @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getGamesByTournamentName(tournamentName, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }


    @GetMapping("/hometeam/{name}")
    public List<GameDto> getGamesByHomeTeamName(@PathVariable("name") String homeTeam,
                                                @RequestParam("tournamentName") String tournamentName,
                                                @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getGamesByHomeTeamName(tournamentName, homeTeam, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }


    @GetMapping("/awayteam/{name}")
    public List<GameDto> getGamesByAwayTeamName(@PathVariable("name") String awayTeam,
                                                @RequestParam("tournamentName") String tournamentName,
                                                @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getGamesByAwayTeamName(tournamentName, awayTeam, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }

    @GetMapping("/team/{name}")
    public List<GameDto> getGamesByTeamName(@PathVariable("name") String team,
                                            @RequestParam("tournamentName") String tournamentName,
                                            @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getGamesByTeamName(tournamentName, team, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }

    @GetMapping("/h2h/{homename}/{awayname}")
    public List<GameDto> getGamesByHomeTeamNameAndAwayTeamName(@PathVariable("homename") String homename,
                                                               @PathVariable("awayname") String awayname,
                                                               @RequestParam("tournamentName") String tournamentName,
                                                               @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getGamesByHomeTeamNameAndAwayTeamName(tournamentName, homename, awayname, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }

    @GetMapping("/fon")
    public List<GameDto> getByFon(@RequestParam("fonHome") double fonHome,
                                  @RequestParam("fonDraw") double fonDraw,
                                  @RequestParam("fonAway") double fonAway,
                                  @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getByFon(fonHome, fonDraw, fonAway, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }

    @GetMapping("/fon/tournament/{tournamentName}")
    public List<GameDto> getByFonAndTournament(@RequestParam("fonHome") double fonHome,
                                               @RequestParam("fonDraw") double fonDraw,
                                               @RequestParam("fonAway") double fonAway,
                                               @PathVariable("tournamentName") String tournamentName,
                                               @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getByFonAndTournament(tournamentName, fonHome, fonDraw, fonAway, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }


    @GetMapping("/man")
    public List<GameDto> getByMan(@RequestParam("manHome") double manHome,
                                  @RequestParam("manDraw") double manDraw,
                                  @RequestParam("manAway") double manAway,
                                  @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getByMan(manHome, manDraw, manAway, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }

    @GetMapping("/man/tournament/{tournamentName}")
    public List<GameDto> getByManAndTournament(@RequestParam("manHome") double manHome,
                                               @RequestParam("manDraw") double manDraw,
                                               @RequestParam("manAway") double manAway,
                                               @PathVariable("tournamentName") String tournamentName,
                                               @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getByManAndTournament(tournamentName, manHome, manDraw, manAway, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }


    @GetMapping("/pool/tournament/{tournamentName}")
    public List<GameDto> getPollQueerness(@RequestParam("fonHome") double fonHome,
                                          @RequestParam("fonAway") double fonAway,
                                          @RequestParam("manHome") double manHome,
                                          @RequestParam("manAway") double manAway,
                                          @PathVariable("tournamentName") String tournamentName,
                                          @PageableDefault(size = 12) Pageable pageable) {
        List<Game> games = gameService.getPoolQueerness(tournamentName, fonHome, fonAway, manHome, manAway, pageable);
        return mapperFacade.mapAsList(games, GameDto.class);
    }
}
