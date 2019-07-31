package ge.vazisu.gaudium.resource;

import ge.vazisu.gaudium.domain.Prediction;
import ge.vazisu.gaudium.dto.PredictionDto;
import ge.vazisu.gaudium.repository.PredictionRepository;
import ge.vazisu.gaudium.service.PredictionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PredictionResourceImpl.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/prediction")
public class PredictionResourceImpl {

    private MapperFacade mapperFacade;
    private PredictionRepository predictionRepository;
    private PredictionService predictionService;

    @PostMapping
    public void createPrediction(@RequestBody PredictionDto dto) {
        predictionRepository.save(mapperFacade.map(dto, Prediction.class));
    }

    @PostMapping("/draw/{drawnumber}")
    public void updatePredictionInfo(@PathVariable("drawnumber") int drawNumber) {
        predictionService.updatePredictionInfo(drawNumber);
    }
}
