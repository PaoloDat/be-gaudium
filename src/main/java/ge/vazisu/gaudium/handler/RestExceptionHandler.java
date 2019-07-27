package ge.vazisu.gaudium.handler;

import ge.vazisu.gaudium.domain.RestExceptionDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Rest exception handler.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class) //400
    public ResponseEntity<RestExceptionDto> handleIllegalArgumentException(IllegalArgumentException ex) {
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(
                new RestExceptionDto(
                        HttpStatus.BAD_REQUEST.value(),
                        ex.getMessage()),
                HttpStatus.BAD_REQUEST
        );
    }
}
