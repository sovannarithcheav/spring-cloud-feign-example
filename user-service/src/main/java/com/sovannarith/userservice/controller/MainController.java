package com.sovannarith.userservice.controller;

import com.sovannarith.userservice.repository.BillionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billionaire")
public class MainController {

    @Autowired
    private BillionaireRepository billRepo;

    @GetMapping("/list")
    public ResponseEntity listBillionaires(){
        return ResponseEntity.ok(billRepo.findAll());
    }

}
