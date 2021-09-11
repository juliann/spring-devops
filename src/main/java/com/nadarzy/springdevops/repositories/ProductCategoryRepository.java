package com.nadarzy.springdevops.repositories;

import com.nadarzy.springdevops.domain.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {}
