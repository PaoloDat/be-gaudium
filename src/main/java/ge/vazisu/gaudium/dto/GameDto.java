package ge.vazisu.gaudium.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * GameDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class GameDto {
    private Long id;
    private int drawNumber;
    private String tournamentName;
    private String homeTeamName;
    private String awayTeamName;
    private int homeScore;
    private int awayScore;
    private double fonHome;
    private double fonDraw;
    private double fonAway;
    private double manHome;
    private double manDraw;
    private double manAway;
}
