package com.example.postgresql.repository;

import com.example.postgresql.model.appeal.Appeal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface AppealRepository extends CrudRepository<Appeal , Long> {
}
