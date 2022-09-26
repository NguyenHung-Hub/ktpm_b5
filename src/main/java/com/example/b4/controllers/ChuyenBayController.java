package com.example.b4.controllers;

import com.example.b4.models.ChuyenBay;
import com.example.b4.services.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/chuyenbays")
public class ChuyenBayController{

    private final ChuyenBayService chuyenBayService;

    @Autowired
    public ChuyenBayController(ChuyenBayService chuyenBayService){
        this.chuyenBayService = chuyenBayService;
    }



    @GetMapping
    public List<ChuyenBay> getAll(){

        return chuyenBayService.getAll();
    }
    @GetMapping("/{id}")
    public ChuyenBay get(@PathVariable String id){

        return chuyenBayService.getById(id);
    }
    @PostMapping
    public ChuyenBay create(@RequestBody ChuyenBay chuyenBay){
        System.out.println(chuyenBay);
       return chuyenBayService.create(chuyenBay);
    }

    @PutMapping
    public ChuyenBay update(@RequestBody ChuyenBay chuyenBay){
        return  chuyenBayService.update(chuyenBay);
    }

    //
    @GetMapping("/chuyen-bay-di-da-lat")
    public List<ChuyenBay> getChuyenBayDaLat(){

        return  chuyenBayService.findChuyenBayByGaDen("DAD");
    }
}