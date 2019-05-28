package com.example.controllers;

import com.example.models.Barang;
import com.example.models.Peminjaman;
import com.example.repository.BarangRepository;
import com.example.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

@RestController
public class RequestController {

    @Autowired
    PeminjamanRepository peminjamanRepository;

    @GetMapping("/orders")
    public List<Peminjaman> index(){
        return peminjamanRepository.findAll();
    }

    @PostMapping("/order")
    public Peminjaman create(@RequestBody Peminjaman peminjaman){
    	Peminjaman createPeminjaman = peminjamanRepository.save(peminjaman);
        return createPeminjaman;
    }

    @GetMapping("/order/approve/{peminjaman_id}")
    public Peminjaman approve(@PathVariable("peminjaman_id") int peminjaman_id) {
    	Peminjaman peminjaman = peminjamanRepository.getOne(peminjaman_id);
    	peminjamanRepository.save(peminjaman);
        return peminjaman;
    }

    @GetMapping("/order/reject/{peminjaman_id}")
    public Peminjaman reject(@PathVariable("peminjaman_id") int peminjaman_id) {
    	Peminjaman peminjaman = peminjamanRepository.getOne(peminjaman_id);
    	peminjamanRepository.save(peminjaman);
        return peminjaman;
    }
}
