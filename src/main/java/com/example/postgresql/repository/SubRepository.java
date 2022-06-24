package com.example.postgresql.repository;

import com.example.postgresql.model.sub.Sub;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRepository extends CrudRepository<Sub, Long> {
}
