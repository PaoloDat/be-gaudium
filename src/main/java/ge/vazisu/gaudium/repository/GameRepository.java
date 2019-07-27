package ge.vazisu.gaudium.repository;

import ge.vazisu.gaudium.domain.Game;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository for {@link Game}.
 *
 * @author Pavel_Datunashvili
 */
public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findAllByTournamentNameOrderByIdDesc(String tournamentName, Pageable pageable);

    List<Game> findAllByTournamentNameAndHomeTeamNameOrderByIdDesc(String tournamentName, String homeTeamName, Pageable pageable);

    List<Game> findAllByTournamentNameAndAwayTeamNameOrderByIdDesc(String tournamentName, String awayTeamName, Pageable pageable);

    @Query("select g from Game g where g.tournamentName = :tournamentName and (g.homeTeamName = :name or g.awayTeamName = :name)")
    List<Game> findAllByTournamentNameAndHomeTeamNameOrAwayTeamNameOrderByIdDesc(@Param("tournamentName") String tournamentName,
                                                                                 @Param("name") String homeTeamName,
                                                                                 Pageable pageable);

    List<Game> findAllByTournamentNameAndHomeTeamNameAndAwayTeamNameOrderByIdDesc(String tournamentName,
                                                                                  String homeTeamName,
                                                                                  String awayTeamName,
                                                                                  Pageable pageable);

    List<Game> findAllByFonHomeAndFonDrawAndFonAwayOrderByIdDesc(double fonHome, double fonDraw, double fonAway, Pageable pageable);

    List<Game> findAllByTournamentNameAndFonHomeAndFonDrawAndFonAwayOrderByIdDesc(String tournamentName,
                                                                                  double fonHome,
                                                                                  double fonDraw,
                                                                                  double fonAway,
                                                                                  Pageable pageable);

    List<Game> findAllByManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
            double homeMin, double homeMax, double drawMin, double drawMax, double awayMin, double awayMax, Pageable pageable);

    List<Game> findAllByTournamentNameAndManHomeGreaterThanAndManHomeLessThanAndManDrawGreaterThanAndManDrawLessThanAndManAwayGreaterThanAndManAwayLessThanOrderByIdDesc(
            String tournamentName, double homeMin, double homeMax, double drawMin, double drawMax, double awayMin, double awayMax, Pageable pageable);



    @Query("select g from Game  g where g.fonHome > g.fonAway and g.manHome < g.manAway and g.tournamentName = :tournamentName")
    List<Game> findFonHomeAndManAwayQueerness(@Param("tournamentName") String tournamentName, Pageable pageable);

    @Query("select g from Game  g where g.fonHome < g.fonAway and g.manHome > g.manAway and g.tournamentName = :tournamentName")
    List<Game> findFonAwayAndManHomeQueerness(@Param("tournamentName") String tournamentName, Pageable pageable);

}
