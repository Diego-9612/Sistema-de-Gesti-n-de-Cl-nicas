package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Patients;

@Repository
public class PatientsRepositoryImpl implements PatientsRepository {

    private List<Patients> patients = new ArrayList<>();
    private Long contadorId = 1L;

    @Override
    public List<Patients> findAll() {
        return patients;
    }

    @Override
    public Optional<Patients> findById(Long id) {
        return patients.stream().filter(p -> p.getId().equals(id)).findFirst();

    }

    @Override
    public void save(Patients patient) {
        if (patient.getId() == null) {
            patient.setId(contadorId++);
        }
        patients.removeIf(p -> p.getId().equals(patient.getId()));
        patients.add(patient);

    }

}
