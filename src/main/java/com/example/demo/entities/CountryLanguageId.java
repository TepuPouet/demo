//package com.example.demo.entities;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//
//
//public class CountryLanguageId implements Serializable {
//
//    @ManyToOne
//    @JoinColumn(name ="country_code")
//    private Country country;
//
//    private String language;
//
//    public CountryLanguageId(String language, Country country) {
//        this.language = language;
//        this.country = country;
//    }
//
//    public CountryLanguageId() {    }
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }
//
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//}
