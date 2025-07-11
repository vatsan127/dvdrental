package dev.srivatsan.dvdrental.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomerNotFoundException extends RuntimeException {
    private final HttpStatus status;
    private final String message;

    public CustomerNotFoundException() {
        status = HttpStatus.NOT_FOUND;
        message = "Customer Not Found";
    }

}
