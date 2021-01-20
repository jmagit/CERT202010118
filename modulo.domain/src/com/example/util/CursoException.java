package com.example.util;

@SuppressWarnings("serial")
public class CursoException extends Exception {

	public CursoException() {
	}

	public CursoException(String message) {
		super(message);
	}

	public CursoException(Throwable cause) {
		super(cause);
	}

	public CursoException(String message, Throwable cause) {
		super(message, cause);
	}

	public CursoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
