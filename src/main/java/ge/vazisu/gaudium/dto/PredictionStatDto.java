package ge.vazisu.gaudium.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * PredictionStatDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class PredictionStatDto {
    private int tournamentHome;
    private int tournamentDraw;
    private int tournamentAway;
    private int tournamentFonPool;
    private int tournamentFonMiddle;
    private int tournamentFonUnpool;
    private int tournamentManPool;
    private int tournamentManMiddle;
    private int tournamentManUnpool;

    private int allHome;
    private int allDraw;
    private int allAway;
    private int allFonPool;
    private int allFonMiddle;
    private int allFonUnpool;
    private int allManPool;
    private int allManMiddle;
    private int allManUnpool;
}
