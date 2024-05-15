package com.skillstorm.project_2.services;

public class CapacityException extends Exception {

    String message;

    public CapacityException(){}

    public CapacityException(String message) {
        this.message = message;
    }
}
