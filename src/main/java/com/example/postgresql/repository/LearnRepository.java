package com.example.postgresql.repository;

import com.example.postgresql.model.learn.Learn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnRepository extends CrudRepository<Learn , Long> {
}
