package br.com.algartech.appex2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value = HttpStatus.BAD_REQUEST, reason = "CPF invalido")
public class CPFValidationException extends RuntimeException {
private static final long serialVersionUID = 1L;
	public CPFValidationException(String message) {
		super(message);
	}
}
