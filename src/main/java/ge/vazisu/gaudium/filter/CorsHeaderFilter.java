package ge.vazisu.gaudium.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Filter to add allowed host to HTTP header.
 *
 * @author Pavel_Datunashvili
 */
@RestControllerAdvice
public class CorsHeaderFilter implements ResponseBodyAdvice<Object> {

    @Value("${cors.allowed.host}")
    private String allowedHost;

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        serverHttpResponse.getHeaders().add("Access-Control-Allow-Origin", allowedHost);
        return body;
    }
}
