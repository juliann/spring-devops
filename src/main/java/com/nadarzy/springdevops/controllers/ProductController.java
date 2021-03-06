package com.nadarzy.springdevops.controllers;

import com.nadarzy.springdevops.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

  private ProductService productService;

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product/{id}")
  public String getProductById(@PathVariable Integer id, Model model) {

    model.addAttribute("product", productService.getProduct(id));

    return "product";
  }
}
