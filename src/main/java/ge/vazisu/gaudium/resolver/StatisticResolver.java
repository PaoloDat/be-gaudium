package ge.vazisu.gaudium.resolver;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.dto.ResolvedGames;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * StatisticResolver.
 *
 * @author Pavel_Datunashvili
 */
@Component
public class StatisticResolver {

    public ResolvedGames resolveGames(List<Game> games) {
        ResolvedGames resolvedGames = new ResolvedGames();
        for (Game game : games) {
            if (game.getHomeScore() > game.getAwayScore()) {
                resolvedGames.addWin();

                if ((game.getFonHome() > game.getFonAway()) && (game.getFonHome() > game.getFonDraw())) {
                    resolvedGames.addFonPool();
                } else if ((game.getFonHome() < game.getFonAway()) && (game.getFonHome() < game.getFonDraw())) {
                    resolvedGames.addFonUnpool();
                } else {
                    resolvedGames.addFonMiddle();
                }

                if ((game.getManHome() > game.getManAway()) && (game.getManHome() > game.getManDraw())) {
                    resolvedGames.addManPool();
                } else if ((game.getManHome() < game.getManAway()) && (game.getManHome() < game.getManDraw())) {
                    resolvedGames.addManUnpool();
                } else {
                    resolvedGames.addManMiddle();
                }


            } else if (game.getHomeScore() < game.getAwayScore()) {
                resolvedGames.addAway();

                if ((game.getFonAway() > game.getFonHome() && (game.getFonAway() > game.getFonDraw()))) {
                    resolvedGames.addFonPool();
                } else if ((game.getFonAway() < game.getFonHome() && (game.getFonAway() < game.getFonDraw()))) {
                    resolvedGames.addFonUnpool();
                } else {
                    resolvedGames.addFonMiddle();
                }


                if ((game.getManAway() > game.getManHome() && (game.getManAway() > game.getManDraw()))) {
                    resolvedGames.addManPool();
                } else if ((game.getManAway() < game.getManHome() && (game.getManAway() < game.getManDraw()))) {
                    resolvedGames.addManUnpool();
                } else {
                    resolvedGames.addManMiddle();
                }


            } else {
                resolvedGames.addDraw();

                if ((game.getFonDraw() > game.getFonHome()) && (game.getFonDraw() > game.getFonAway())) {
                    resolvedGames.addFonPool();
                } else if ((game.getFonDraw() < game.getFonHome()) && (game.getFonDraw() < game.getFonAway())) {
                    resolvedGames.addFonUnpool();
                } else {
                    resolvedGames.addFonMiddle();
                }


                if ((game.getManDraw() > game.getManHome()) && (game.getManDraw() > game.getManAway())) {
                    resolvedGames.addManPool();
                } else if ((game.getManDraw() < game.getManHome()) && (game.getManDraw() < game.getManAway())) {
                    resolvedGames.addManUnpool();
                } else {
                    resolvedGames.addManMiddle();
                }
            }
        }
        return resolvedGames;
    }

}
