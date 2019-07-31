package ge.vazisu.gaudium.dto;

import ge.vazisu.gaudium.enums.Criteria;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

/**
 * PredictionDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
public class PredictionDto {
    private int drawNumber;
    private String tournamentName;
    private String homeTeamName;
    private String awayTeamName;
    Set<Criteria> criteria;
}
