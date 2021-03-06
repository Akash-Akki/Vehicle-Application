package com.mitchell_international.VehicleApplication.Exception;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DTO class to encapsulate error message which needs to be sent {@link ErrorResponse}
 *
 * @author Akash Akki
 *
 */
public class ValidationErrors implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * List of error message
     */
    private List<String> errorMessages = new ArrayList<>();

    /**
     * Map containing error message specific to field in input. Field name or attribute name in the
     * input is key and error message will be the value
     */
    private Map<String, String> specificErrors = new HashMap<>();

    /**
     * boolean to indicate whether Entity contains error message. Default value is false. This will be
     * true if either errorMessage List or specificErrors Map is not empty, false otherwise
     */
    @JsonIgnore
    private boolean errorAvailable = false;

    public List<String> getErrorMessages() {
        return errorMessages;
    }



    public Map<String, String> getSpecificErrors() {
        return specificErrors;
    }


    public void addSpecificError(String key, String value) {
        this.errorAvailable = true;
        this.specificErrors.put(key, value);
    }

    public boolean isErrorAvailable() {
        return errorAvailable;
    }

    public void setErrorAvailable(boolean errorAvailable) {
        this.errorAvailable = errorAvailable;
    }

   @Override
    public String toString() {
        return "ValidationErrors [errorMessages=" + errorMessages + ", specificErrors=" + specificErrors
                + ", errorAvailable=" + errorAvailable + "]";
    }

}
