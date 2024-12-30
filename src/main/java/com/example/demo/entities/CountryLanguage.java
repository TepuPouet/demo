//package com.example.demo.entities;
//
//import jakarta.persistence.*;
//
//
//public class CountryLanguage {
//
//    @EmbeddedId
//    private CountryLanguageId id;
//
//    @Column(name = "isOfficial", nullable = false)
//    private boolean isOfficial;
//
//    @Column(nullable = false)
//    private float percentage;
//
//    public CountryLanguageId getId() {
//        return id;
//    }
//
//    public void setId(CountryLanguageId id) {
//        this.id = id;
//    }
//
//    public boolean isOfficial() {
//        return isOfficial;
//    }
//
//    public void setOfficial(boolean official) {
//        isOfficial = official;
//    }
//
//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }
//}
