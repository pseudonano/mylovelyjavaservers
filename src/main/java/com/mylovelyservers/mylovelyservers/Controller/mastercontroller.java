package com.mylovelyservers.mylovelyservers.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylovelyservers.mylovelyservers.Repository.ImasterRepository;

@RestController
public class mastercontroller {
   
    private ImasterRepository masterRepository;

    public mastercontroller(ImasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    // @PostMapping("/notes")
    // public

    @GetMapping("/notes")
    public String findString(){
        masterRepository.findAll();
        return "Sukses";
    }
}
