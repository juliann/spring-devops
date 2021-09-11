package com.nadarzy.springdevops.repositories;

import com.nadarzy.springdevops.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {}
