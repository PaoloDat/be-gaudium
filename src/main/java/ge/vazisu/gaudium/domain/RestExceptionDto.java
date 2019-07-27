package ge.vazisu.gaudium.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * RestExceptionDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class RestExceptionDto {
    private int status;
    private String message;
}