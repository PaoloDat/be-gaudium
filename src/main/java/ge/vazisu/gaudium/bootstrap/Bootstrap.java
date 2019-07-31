package ge.vazisu.gaudium.bootstrap;

import ge.vazisu.gaudium.repository.GameRepository;
import ge.vazisu.gaudium.repository.PredictionRepository;
import ge.vazisu.gaudium.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Bootstrap.
 *
 * @author Pavel_Datunashvili
 */
@Component
@AllArgsConstructor
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private GameRepository gameRepository;
    private GameService gameService;
    private PredictionRepository predictionRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    }
}
