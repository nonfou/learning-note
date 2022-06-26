package com.nonfou.design.pattern.factory;

public interface Factory {

  default Product create(String type) {
    Product product = createProduct(type);
    registerProduct(product);
    return product;
  }

  Product createProduct(String type);

  void registerProduct(Product product);
}
