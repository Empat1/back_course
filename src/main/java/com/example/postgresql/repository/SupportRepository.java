package com.example.postgresql.repository;

import com.example.postgresql.model.support.Support;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends CrudRepository<Support , Long> {
}
