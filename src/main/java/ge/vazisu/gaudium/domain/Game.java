package ge.vazisu.gaudium.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Domain for a game from draw.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Table(name = "draws")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int drawNumber;
    private LocalDate date;
    private int tournamentType;
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

