package com.jiraHex.comun;

import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.log4j.Log4j2;

@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {

	@ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException exception, HttpServletRequest httpRequest) throws UnsupportedEncodingException {
        log.info("NoSuchElementException (404) handled");
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("NOT FOUND, request: " + httpRequest.getRequestURI());
    }
	
	@ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException exception, HttpServletRequest httpRequest) throws UnsupportedEncodingException {
        log.info("ConstraintViolationException (400) handled");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("WRONG DATA FORMAT, request: " + httpRequest.getRequestURI());
    }

}
