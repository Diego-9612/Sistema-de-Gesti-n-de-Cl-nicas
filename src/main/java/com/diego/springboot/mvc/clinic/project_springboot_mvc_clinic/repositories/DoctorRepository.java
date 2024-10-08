package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories;

import java.util.List;
import java.util.Optional;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Doctors;

public interface DoctorRepository {

    public List<Doctors> findAll();

    public Optional<Doctors> findById(Long id);

    public void save(Doctors doctor);

}
