package com.samsung.service;

import com.samsung.domain.Author;

import java.util.List;

public interface AuthorService {

    Author insert(String name);

    List<Author> getAll();

    Author getById(int id);

    Author getByName(String name);

    Author update(int id, String name);

    void deleteById(int id);
}
