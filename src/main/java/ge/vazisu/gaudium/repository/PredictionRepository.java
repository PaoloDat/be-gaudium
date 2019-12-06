package ge.vazisu.gaudium.repository;

import ge.vazisu.gaudium.domain.Prediction;
import ge.vazisu.gaudium.enums.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

/**
 * PredictionRepository.
 *
 * @author Pavel_Datunashvili
 */
public interface PredictionRepository extends JpaRepository<Prediction, Long> {

    List<Prediction> findAllByDrawNumber(int drawNumber);

    List<Prediction> findAllByCriteriaInAndRefIdIsNotNull(Set<Criteria> criteria);

    List<Prediction> findAllByTournamentNameAndCriteriaInAndRefIdIsNotNull(String tournamentName, Set<Criteria> criteria);
}
