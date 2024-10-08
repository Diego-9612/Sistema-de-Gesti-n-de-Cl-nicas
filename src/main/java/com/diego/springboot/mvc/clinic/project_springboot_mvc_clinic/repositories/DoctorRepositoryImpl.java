package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Doctors;

@Repository
public class DoctorRepositoryImpl implements DoctorRepository {

    private List <Doctors> doctors = new ArrayList<>();
    private Long contadorId = 1L;

    @Override
    public List<Doctors> findAll() {
        return doctors;
    }

    @Override
    public Optional<Doctors> findById(Long id) {
        return doctors.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public void save(Doctors doctor) {
        if (doctor.getId() == null) {
            doctor.setId(contadorId++);
        }
        doctors.removeIf(p -> p.getId().equals(doctor.getId()));
        doctors.add(doctor);

    }

}
