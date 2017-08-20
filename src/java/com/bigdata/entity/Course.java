/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.entity;

/**
 *
 * @author suresh
 */
public class Course {
    private Integer id;
    private String title;
    private Double price;
    private String  duration;
    private Boolean status;

    public Course() {
    }

    public Course(Integer id, String title, Double price, String duration, Boolean status) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.duration = duration;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
    
}
