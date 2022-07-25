package com.learnspring.learningspring.model;

public class Pojo {

    private String message;

    public String getMessage() {
        System.out.println("Required message: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
