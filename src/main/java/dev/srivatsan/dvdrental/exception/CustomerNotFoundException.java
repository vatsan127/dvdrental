package dev.srivatsan.dvdrental.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomerNotFoundException extends RuntimeException {
    private final HttpStatus status;
    private final String message;
    private final int id;

    public CustomerNotFoundException(int id) {
        this.id = id;
        status = HttpStatus.NOT_FOUND;
        message = "Customer Not Found For Id - " + id;
    }

}
