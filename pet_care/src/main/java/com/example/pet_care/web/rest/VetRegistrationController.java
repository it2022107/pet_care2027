package com.example.pet_care.web.rest;


import com.example.pet_care.core.model.Veterinarian;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetRegistrationController {

    @GetMapping("/registerVet")
    public String vetRegistration(final Model model) {
        model.addAttribute("veterinarian", new Veterinarian());

        return "vetRegistration.html";
    }

}
