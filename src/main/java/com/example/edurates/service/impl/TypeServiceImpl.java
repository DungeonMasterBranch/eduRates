package com.example.edurates.service.impl;

import com.example.edurates.models.Type;
import com.example.edurates.repositories.TypeRepository;
import com.example.edurates.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    private TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<Type> getAll() {
        return typeRepository.findAll();
    }

    @Override
    public Type getById(Long id) {
        return typeRepository.findById(id).get();
    }

    @Override
    public void create(Type type) {
        typeRepository.save(type);
    }

    @Override
    public Type update(Type type) {
        return typeRepository.save(type);
    }
}
