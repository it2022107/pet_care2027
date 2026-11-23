package com.example.pet_care.web.rest;


import com.example.pet_care.core.model.PetOwner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetOwnerRegistrationController {

    @GetMapping("/registerOwner")
    public String showPetOwnerRegistration(final Model model) {
        model.addAttribute("petOwner", new PetOwner(null,
                "", "",
                "", "", "",
                "", "", null));

        return "registerOwner.html";

    }


    @PostMapping("/registerOwner")
    public String processPetOwnerRegistration(@ModelAttribute("petOwner") PetOwner petOwner) {
        return null;
    }

}
