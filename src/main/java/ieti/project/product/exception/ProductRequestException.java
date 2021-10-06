package ieti.project.product.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ProductRequestException extends RuntimeException{
    public ProductRequestException(String message, ProductRequestException e, HttpStatus badRequest, ZonedDateTime z) {
        super(message);
    }

    public ProductRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductRequestException(String message) {
        super(message);
    }
}
