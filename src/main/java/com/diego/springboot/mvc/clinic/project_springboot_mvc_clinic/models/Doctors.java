package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models;

public class Doctors {

    private Long id;
    private String name;
    private String lastName;
    private String medicalSpecialty;

    public Doctors() {
    }

    public Doctors(Long id, String name, String lastName, String medicalSpecialty) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.medicalSpecialty = medicalSpecialty;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(String medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

}
