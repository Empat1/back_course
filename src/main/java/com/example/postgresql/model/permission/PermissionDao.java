package com.example.postgresql.model.permission;

import com.example.postgresql.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionDao {
    @Autowired
    private PermissionRepository repository;

    public Permission save(Permission permission) {
        return repository.save(permission);
    }

    public List<Permission> getAllEmployees() {
        List<Permission> permissions = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(permissions::add);
        return permissions;
    }
}
