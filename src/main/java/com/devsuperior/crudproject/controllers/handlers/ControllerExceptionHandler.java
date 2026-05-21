package com.devsuperior.crudproject.controllers.handlers;

import com.devsuperior.crudproject.dto.CustomErr;
import com.devsuperior.crudproject.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CustomErr> resourceNotFound(ResourceNotFoundException e, HttpServletRequest http){
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomErr error = new CustomErr(Instant.now(), status.value(), e.getMessage(), http.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}
