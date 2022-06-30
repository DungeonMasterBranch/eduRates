package com.example.edurates.controllers;

import com.example.edurates.models.Center;
import com.example.edurates.models.District;
import com.example.edurates.models.Type;
import com.example.edurates.service.DistrictService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/district")
public class DistrictController {

    private DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping(value = "/getAll")
    public List<District> getAllDistricts() {
        List<District> districts;
        districts = districtService.getAll();
        return districts;
    }

    @PostMapping(value = "/create")
    public District saveDistrict(@RequestBody District district) {
        districtService.create(district);
        return district;
    }

    @PutMapping(value = "/update")
    public District updateDistrict(@RequestBody District district) {
        districtService.update(district);
        return district;
    }
}
