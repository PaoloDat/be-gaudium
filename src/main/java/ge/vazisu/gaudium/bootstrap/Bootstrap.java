package ge.vazisu.gaudium.bootstrap;

import ge.vazisu.gaudium.repository.GameRepository;
import ge.vazisu.gaudium.repository.PredictionRepository;
import ge.vazisu.gaudium.service.GameService;
import ge.vazisu.gaudium.service.PredictionService;
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
    private PredictionService predictionService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        predictionService.getPredictionStat("Футбол. Швеция. 1-я лига", Criteria.MAN_POOL_R_SOME_MIDDLE);
    }
}
