//package com.example.demo.entities;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//
//public class Country {
//
//    @Id
//    @Column(nullable = false, length = 3)
//    private String code;
//
//    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
//    @JsonIgnore
//    private Set<City> cities;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private String region;
//
//    @OneToMany(mappedBy="id.country", fetch = FetchType.LAZY)
//    @JsonIgnore
//    private Set<CountryLanguage> countryLanguages;
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRegion() {
//        return region;
//    }
//
//    public Set<City> getCities() {
//        return cities;
//    }
//
//    public void setCities(Set<City> cities) {
//        this.cities = cities;
//    }
//
//    public void setRegion(String region) {
//        this.region = region;
//    }
//
//    public Set<CountryLanguage> getCountryLanguages() {
//        return countryLanguages;
//    }
//
//    public void setCountryLanguages(Set<CountryLanguage> countryLanguages) {
//        this.countryLanguages = countryLanguages;
//    }
//}
