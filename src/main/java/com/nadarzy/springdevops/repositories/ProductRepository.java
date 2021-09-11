package com.nadarzy.springdevops.repositories;

import com.nadarzy.springdevops.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {}
