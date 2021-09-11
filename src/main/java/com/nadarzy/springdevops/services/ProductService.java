package com.nadarzy.springdevops.services;

import com.nadarzy.springdevops.domain.Product;

import java.util.List;

public interface ProductService {

  Product getProduct(Integer id);

  List<Product> listProducts();
}
