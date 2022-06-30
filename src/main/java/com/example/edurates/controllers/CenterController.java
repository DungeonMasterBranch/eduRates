package com.example.edurates.controllers;

import com.example.edurates.models.Center;
import com.example.edurates.models.District;
import com.example.edurates.service.CenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/center")
public class CenterController {

    private CenterService centerService;

    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @GetMapping(value = "/getAll")
    public List<Center> getAllCenters() {
        List<Center> centers;
        centers = centerService.getAll();
        return centers;
    }

    @GetMapping(value = "/getById/{id}")
    public Center getCenterById(@PathVariable(value = "id") Long id) {
        Center center;
        center = centerService.getById(id);
        return center;
    }

    @PostMapping(value = "/create")
    public Center saveCenter(@RequestBody Center center) {
        centerService.create(center);
        return center;
    }

    @PutMapping(value = "/update")
    public Center updateCenter(@RequestBody Center center) {
        centerService.update(center);
        return center;
    }
}