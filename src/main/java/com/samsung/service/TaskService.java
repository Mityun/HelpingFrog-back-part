package com.samsung.service;

import com.samsung.domain.Task;

import java.util.List;

public interface TaskService {

    Task insert(
            String nameTask,
            int authorId,
            int importanceId
    );

    Task update(
            int id,
            String nameTask,
            int nameAuthor,
            int nameImportance
    );

    List <Task> getAll();

    Task getById(int id);

    List <Task> getByName(String name);

    void deleteById(int id);
}
