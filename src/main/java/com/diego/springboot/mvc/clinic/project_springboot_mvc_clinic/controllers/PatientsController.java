package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Patients;
import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories.PatientsRepository;

@Controller
@RequestMapping("/data")
public class PatientsController {

    @Autowired
    private PatientsRepository patientsRepository;

    @GetMapping("/listp")
    public String listPatients(Model model) {
        List<Patients> patients = patientsRepository.findAll();
        model.addAttribute("patients", patients); 
        return "patients_list";
    }

    @GetMapping("/new")
    public String formsNewPatients(Model model) {
        model.addAttribute("patient", new Patients()); 
        return "Patients_form";
    }
}

