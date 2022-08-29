package com.example.demo.student;

import java.time.LocalDate;

import org.apache.tomcat.jni.Local;

public class Student {
    private Long id;
    private String name; 
    private String email; 
    private LocalDate dateOfBrith; 
    private Integer age; 

    // no arg constructor 
    public Student() {

    }

    // all arg constructor 
    public Student(Long id, String name, String email, LocalDate dateOfBirth, Integer age) {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.dateOfBrith = dateOfBirth; 
        this.age = age; 
    }

    // no id constructor 
    public Student(String name, String email, LocalDate dateOfBirth, Integer age) {
        this.name = name; 
        this.email = email; 
        this.dateOfBrith = dateOfBirth; 
        this.age = age; 
    }

    // getters and setters 
    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith; 
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBrith = dateOfBirth; 
    }

    public Integer getAge() {
        return age; 
    }

    public void setAge(Integer age) {
        this.age = age; 
    }

    @Override 
    public String toString() {
        return "Student{" + 
                "id=" + id +
                ", name='" + name + '\'' + 
                ", email=" + email + '\'' + 
                ", dateOfBirth=" + dateOfBrith +
                ", age=" + age + 
                '}';
    }
    
}
