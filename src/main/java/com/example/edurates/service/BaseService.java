package com.example.edurates.service;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();

    T getById(Long id);

    void create(T t);

    T update(T t);
}
