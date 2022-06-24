package com.example.postgresql.repository;

import com.example.postgresql.model.dictionary.Dictionary;
import com.example.postgresql.model.language.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends CrudRepository<Dictionary, Long> {
}
