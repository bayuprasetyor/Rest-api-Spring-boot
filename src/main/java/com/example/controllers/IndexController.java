package com.example.controllers;

import com.example.models.Barang;
import com.example.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    BarangRepository barangRepository;

    @GetMapping("/home")
    public List<Barang> index(){
        return barangRepository.findAll();
    }

    @GetMapping("/home/{id}")
    public Barang show(@PathVariable String id){
        int BarangId = Integer.parseInt(id);
        return barangRepository.getOne(BarangId);
    }

}
