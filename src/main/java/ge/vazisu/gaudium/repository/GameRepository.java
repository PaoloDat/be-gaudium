package ge.vazisu.gaudium.repository;

import ge.vazisu.gaudium.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for {@link Game}.
 *
 * @author Pavel_Datunashvili
 */
public interface GameRepository extends JpaRepository<Game, Long> {
}
