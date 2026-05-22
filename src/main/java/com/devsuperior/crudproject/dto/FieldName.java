package com.devsuperior.crudproject.dto;

public class FieldName {
    private String message;
    private String fieldError;

    public FieldName(String fieldError, String message) {
        this.fieldError = fieldError;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFieldError() {
        return fieldError;
    }

    public void setFieldError(String fieldError) {
        this.fieldError = fieldError;
    }
}
