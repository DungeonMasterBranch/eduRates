package com.example.edurates.service.impl;

import com.example.edurates.models.Region;
import com.example.edurates.repositories.RegionRepository;
import com.example.edurates.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    RegionRepository regionRepository;

    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public List<Region> getAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region getById(Long id) {
        return regionRepository.findById(id).get();
    }

    @Override
    public void create(Region region) {
        regionRepository.save(region);
    }

    @Override
    public Region update(Region region) {
        return regionRepository.save(region);
    }
}
