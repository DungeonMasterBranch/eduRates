package com.example.edurates.controllers;

import com.example.edurates.models.District;
import com.example.edurates.models.Region;
import com.example.edurates.service.RegionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionController {

    private RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping(value = "/getAll")
    public List<Region> getAllRegions() {
        List<Region> regions;
        regions = regionService.getAll();
        return regions;
    }

    @PostMapping(value = "/create")
    public Region saveRegion(@RequestBody Region region) {
        regionService.create(region);
        return region;
    }

    @PutMapping(value = "/update")
    public Region updateRegion(@RequestBody Region region) {
        regionService.update(region);
        return region;
    }
}
