package ieti.project.product.exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(value = {ProductRequestException.class})
    public ResponseEntity<Object> handleProductException(ProductRequestException e){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ProductRequestException productRequestException = new ProductRequestException(
                e.getMessage(),
                e,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(productRequestException, badRequest);
    }
}
