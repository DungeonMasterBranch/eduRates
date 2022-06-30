package com.example.edurates.service.impl;

import com.example.edurates.models.Language;
import com.example.edurates.repositories.LanguageRepository;
import com.example.edurates.service.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.findAll();
    }

    @Override
    public Language getById(Long id) {
        return languageRepository.findById(id).get();
    }

    @Override
    public void create(Language language) {
        languageRepository.save(language);
    }

    @Override
    public Language update(Language language) {
        return languageRepository.save(language);
    }
}
