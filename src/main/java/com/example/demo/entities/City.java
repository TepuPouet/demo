//package com.example.demo.entities;
//
//import jakarta.persistence.*;
//
//
//public class City {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String name;
//
//    @ManyToOne
//    @JoinColumn(name ="country_code")
//    private Country country;
//
//    private String district;
//
//    @Column(nullable = false)
//    private int population;
//
//    public int getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(int population) {
//        this.population = population;
//    }
//
//    public String getDistrict() {
//        return district;
//    }
//
//    public void setDistrict(String district) {
//        this.district = district;
//    }
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
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
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//}
