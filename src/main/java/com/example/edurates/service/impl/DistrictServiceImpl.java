package com.example.edurates.service.impl;

import com.example.edurates.models.District;
import com.example.edurates.repositories.DistrictRepository;
import com.example.edurates.service.DistrictService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public List<District> getAll() {
        return districtRepository.findAll();
    }

    @Override
    public District getById(Long id) {
        return districtRepository.findById(id).get();
    }

    @Override
    public void create(District district) {
        districtRepository.save(district);
    }

    @Override
    public District update(District district) {
        return districtRepository.save(district);
    }
}
