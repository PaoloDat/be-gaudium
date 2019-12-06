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
    private int tournamentHome = 0;
    private int tournamentDraw = 0;
    private int tournamentAway = 0;
    private int tournamentFonPool = 0;
    private int tournamentFonMiddle = 0;
    private int tournamentFonUnpool = 0;
    private int tournamentManPool = 0;
    private int tournamentManMiddle = 0;
    private int tournamentManUnpool = 0;

    private int allHome = 0;
    private int allDraw = 0;
    private int allAway = 0;
    private int allFonPool = 0;
    private int allFonMiddle = 0;
    private int allFonUnpool = 0;
    private int allManPool = 0;
    private int allManMiddle = 0;
    private int allManUnpool = 0;
}
