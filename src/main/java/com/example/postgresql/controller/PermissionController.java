package com.example.postgresql.controller;

import com.example.postgresql.model.permission.Permission;
import com.example.postgresql.model.permission.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermissionController {
    @Autowired
    PermissionDao permissionDao;

    @GetMapping("/permission/get-all")
    public List<Permission> getAllProducts() {
        return permissionDao.getAllEmployees();
    }

    @PostMapping("/permission/save")
    public Permission save(@RequestBody Permission permission) {
        return permissionDao.save(permission);
    }
}
