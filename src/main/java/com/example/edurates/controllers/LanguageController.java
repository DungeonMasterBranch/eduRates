package com.example.edurates.controllers;

import com.example.edurates.models.Language;
import com.example.edurates.models.Region;
import com.example.edurates.service.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {

    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping(value = "getAll")
    public List<Language> getAllLanguages() {
        List<Language> languages;
        languages = languageService.getAll();
        return languages;
    }

    @PostMapping(value = "create")
    public Language saveLanguage(@RequestBody Language language) {
        languageService.create(language);
        return language;
    }
}
