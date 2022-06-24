package com.example.postgresql.repository;

import com.example.postgresql.model.language.Language;
import com.example.postgresql.model.permission.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {
}
