package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories;

import java.util.List;
import java.util.Optional;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Patients;

public interface PatientsRepository {

    public List<Patients> findAll();

    public Optional<Patients> findById(Long id);

    public void save(Patients patient);

}
