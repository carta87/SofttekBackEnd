package com.Softtek.API.domain.dto;

public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private Integer dni;
    private Boolean employee;

    public Person(){
    }

    public Person(Integer id, String name, String lastName, Integer dni, Boolean employee) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Boolean getEmployee() {
        return employee;
    }
    public void setEmployee(Boolean employee) {
        this.employee = employee;
    }
}
