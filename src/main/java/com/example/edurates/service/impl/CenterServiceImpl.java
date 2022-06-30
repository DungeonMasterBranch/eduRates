package com.example.edurates.service.impl;

import com.example.edurates.models.Center;
import com.example.edurates.repositories.CenterRepository;
import com.example.edurates.service.CenterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {

    private CenterRepository centerRepository;

    public CenterServiceImpl(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    @Override
    public List<Center> getAll() {
        return centerRepository.findAll();
    }

    @Override
    public Center getById(Long id) {
        return centerRepository.findById(id).get();
    }

    @Override
    public void create(Center center) {
        centerRepository.save(center);
    }

    @Override
    public Center update(Center center) {
        return centerRepository.save(center);
    }
}
