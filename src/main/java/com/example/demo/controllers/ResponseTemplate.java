package com.example.demo.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseTemplate {
    @JsonProperty
    private String next;
    @JsonProperty
    private String error;
    @JsonProperty
    private String complete;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }
}
