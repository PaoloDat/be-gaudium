package ge.vazisu.gaudium.repository;

import ge.vazisu.gaudium.domain.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * PredictionRepository.
 *
 * @author Pavel_Datunashvili
 */
public interface PredictionRepository extends JpaRepository<Prediction, Long> {

    List<Prediction> findAllByDrawNumber(int drawNumber);
}
