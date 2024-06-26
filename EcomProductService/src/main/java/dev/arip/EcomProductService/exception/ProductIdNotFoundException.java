package dev.arip.EcomProductService.exception;

public class ProductIdNotFoundException extends RuntimeException{
    public ProductIdNotFoundException() {
    }

    public ProductIdNotFoundException(String message) {
        super(message);
    }

    public ProductIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProductIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
