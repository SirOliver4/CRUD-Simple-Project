package com.devsuperior.crudproject.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidCustomErr extends CustomErr{
    List<FieldName> validError = new ArrayList<>();

    public ValidCustomErr(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(FieldName error){
        validError.add(error);
    }

    public void removeError(FieldName error){
        validError.remove(error);
    }

    public List<FieldName> getErrorList(){
        return validError;
    }
}
