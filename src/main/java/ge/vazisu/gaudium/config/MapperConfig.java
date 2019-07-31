package ge.vazisu.gaudium.config;

import ge.vazisu.gaudium.domain.Game;
import ge.vazisu.gaudium.domain.Prediction;
import ge.vazisu.gaudium.dto.GameDto;
import ge.vazisu.gaudium.dto.PredictionDto;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;

/**
 * Orika Mapper Config.
 *
 * @author Pavel_Datunashvili
 */
@Component
public class MapperConfig implements OrikaMapperFactoryConfigurer {
    @Override
    public void configure(MapperFactory factory) {
        defaultMapping(factory, Game.class, GameDto.class);
        defaultMapping(factory, Prediction.class, PredictionDto.class);
    }

    private <E, D> void defaultMapping(MapperFactory factory, Class<E> entityCls, Class<D> dtoCls) {
        factory.classMap(entityCls, dtoCls)
                .byDefault()
                .register();
    }
}
