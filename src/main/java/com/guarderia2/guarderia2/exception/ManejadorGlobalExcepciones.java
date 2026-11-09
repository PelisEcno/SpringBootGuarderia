package com.guarderia2.guarderia2.exception;

import com.guarderia2.guarderia2.controller.NinosController;
import org.apache.coyote.Response;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.springframework.web.servlet.function.ServerResponse.status;

@RestControllerAdvice
public class ManejadorGlobalExcepciones {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> jsonInvalido(MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Revisa la sintaxis del json");
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> idInvalido(MethodArgumentTypeMismatchException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Formato de ID invalido");
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> conflicto(DataIntegrityViolationException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: La operación no es posible: el registro tiene información asociada o el dato ya existe. Revisa e intenta de nuevo.");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> errorGeneral(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se ha producido un error interno. Por favor vuelva a intentarlo mas tarde.");
    }

}
