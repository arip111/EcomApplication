package dev.arip.EcomProductService.exception;

import dev.arip.EcomProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {

    @ExceptionHandler({ProductIdNotFoundException.class})
    public ResponseEntity handleProductNotFoundException(ProductIdNotFoundException pe)
    {
        ExceptionResponseDTO er = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({CartNotFoundException.class})
    public ResponseEntity handleProductNotFoundException(CartNotFoundException pe)
    {
        ExceptionResponseDTO er = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }
}
