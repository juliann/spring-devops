package com.nadarzy.springdevops.controllers;

import com.nadarzy.springdevops.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  private ProductService productService;

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping({"/", "index"})
  public String getIndex(Model model) {

    model.addAttribute("products", productService.listProducts());

    return "index";
  }

  @RequestMapping("secured")
  public String secured() {
    return "secured";
  }
}
