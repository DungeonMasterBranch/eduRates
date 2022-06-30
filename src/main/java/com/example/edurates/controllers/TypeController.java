package com.example.edurates.controllers;

import com.example.edurates.models.Center;
import com.example.edurates.models.Type;
import com.example.edurates.service.TypeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/type")
public class TypeController {

    private TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping(value = "/getAll")
    public List<Type> getAllTypes() {
        List<Type> types;
        types = typeService.getAll();
        return types;
    }

    @GetMapping(value = "/getById/{id}")
    public Type getTypeById(@PathVariable(value = "id") Long id) {
        Type type;
        type = typeService.getById(id);
        return type;
    }

    @PostMapping(value = "/create")
    public Type saveType(@RequestBody Type type) {
        typeService.create(type);
        return type;
    }

    @PutMapping(value = "/update")
    public Type updateType(@RequestBody Type type) {
        typeService.update(type);
        return type;
    }
}
