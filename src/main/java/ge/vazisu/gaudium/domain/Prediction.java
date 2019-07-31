package ge.vazisu.gaudium.domain;

import ge.vazisu.gaudium.enums.Criteria;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

/**
 * Prediction.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long refId;
    private int drawNumber;
    private String tournamentName;
    private String homeTeamName;
    private String awayTeamName;
    @ElementCollection
    @Enumerated(value = EnumType.STRING)
    Set<Criteria> criteria;
}
