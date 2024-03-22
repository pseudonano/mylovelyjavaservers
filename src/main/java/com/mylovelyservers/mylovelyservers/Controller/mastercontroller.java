package com.mylovelyservers.mylovelyservers.Controller;

import com.mylovelyservers.mylovelyservers.Entity.master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mylovelyservers.mylovelyservers.Repository.ImasterRepository;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class mastercontroller {
   
    private ImasterRepository masterRepository;

    public mastercontroller(ImasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    @PostMapping("/notes")
    public void createNotes(@RequestBody master master){
        master.setTime(new Timestamp(System.currentTimeMillis()));
        masterRepository.save(master);
    }

    @GetMapping("/notes")
    public List<master> findString(){
        List<master> res = masterRepository.findAll();
        return res;
    }

    @GetMapping("/find")
    public List<master> findByTarget(String target){
        List<master> res = masterRepository.findByTarget(target);
        return res;
    }
}
