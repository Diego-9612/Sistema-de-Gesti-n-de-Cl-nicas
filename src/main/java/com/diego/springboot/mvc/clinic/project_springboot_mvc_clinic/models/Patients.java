package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models;

public class Patients {

    private Long id;
    private String name;
    private String lastName;
    private String medicalConsultation;

    public Patients() {
    }

    public Patients(Long id, String name, String lastName, String medicalConsultation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.medicalConsultation = medicalConsultation;
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

    public String getMedicalConsultation() {
        return medicalConsultation;
    }

    public void setMedicalConsultation(String medicalConsultation) {
        this.medicalConsultation = medicalConsultation;
    }

}
