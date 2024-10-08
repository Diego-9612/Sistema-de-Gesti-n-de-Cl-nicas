package com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.models.Doctors;
import com.diego.springboot.mvc.clinic.project_springboot_mvc_clinic.repositories.DoctorRepository;


@Controller
@RequestMapping("/data")
public class DoctorsController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/list")
    public String listDoctors(Model model) {
        List<Doctors> doctors = doctorRepository.findAll();
        model.addAttribute("Doctores Disponibles", doctors);
        return "doctores_list";
    }

    @GetMapping("/newdoctor")
    public String viewNewDoctor(Model model) {
        model.addAttribute("Doctor", new Doctors());
        return "doctor_form";
    }

    @PostMapping("/save")
    public String saveDoctor(@ModelAttribute Doctors doctor) {
        doctorRepository.save(doctor);
        return "redirect:/data/list";
    }

}
