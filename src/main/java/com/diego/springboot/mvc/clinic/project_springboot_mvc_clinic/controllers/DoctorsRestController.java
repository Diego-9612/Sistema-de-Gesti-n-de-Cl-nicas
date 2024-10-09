package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Doctors;

@RestController
@RequestMapping("/doctors")
public class DoctorsRestController {

    static List<Doctors> doctors = new ArrayList<>();

    static {
        doctors.add(new Doctors(1L, "Diego", "Guerrero", "General"));
        doctors.add(new Doctors(2L, "Andres", "Perez", "Cardiologia"));
        doctors.add(new Doctors(3L, "Felipe", "Saa", "Fisio"));
        doctors.add(new Doctors(4L, "Diana", "Villota", "Odontologia"));
    }

    @GetMapping("/list")
    public List<Doctors> searchlist() {

        return doctors;
    }

    @GetMapping(value = "/list", params = "name")
    public List<Doctors> SearchName(@RequestParam String name) {

        return doctors.stream().filter((p) -> p.getName().equals(name)).collect(Collectors.toList());
    }

    @GetMapping(value = "/list", params = { "name", "lastName" })
    public List<Doctors> searchNameLastName(@RequestParam String name, @RequestParam String lastName) {

        Predicate<Doctors> filtro = (p) -> p.getName().equals(name) && p.getLastName().equals(lastName);

        return doctors.stream().filter(filtro).collect(Collectors.toList());
    }

    @GetMapping(value = "/list", params = "order")
    public List<Doctors> searchListTwo(@RequestParam(defaultValue = "name") String order) {

        if (order.equals("name")) {

            return doctors.stream().sorted(Comparator.comparing(Doctors::getName)).collect(Collectors.toList());
        } else if (order.equals("lastName")) {

            return doctors.stream().sorted(Comparator.comparing(Doctors::getLastName)).collect(Collectors.toList());
        } else {

            return doctors.stream().sorted(Comparator.comparing(Doctors::getMedicalSpecialty))
                    .collect(Collectors.toList());
        }

    }

}

