package com.example.b4.controllers;

import com.example.b4.models.ChuyenBay;
import com.example.b4.services.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChuyenBayController{

    private final ChuyenBayService chuyenBayService;

    @Autowired
    public ChuyenBayController(ChuyenBayService chuyenBayService){
        this.chuyenBayService = chuyenBayService;
    }

    @PostMapping("/chuyenbay")
    public ChuyenBay create(@RequestBody ChuyenBay chuyenBay){
        System.out.println(chuyenBay);
       return chuyenBayService.create(chuyenBay);
    }
}