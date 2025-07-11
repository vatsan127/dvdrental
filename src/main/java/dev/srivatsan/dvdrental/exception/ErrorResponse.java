package dev.srivatsan.dvdrental.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private Date timestamp;
    private String message;
    private int status;
}
