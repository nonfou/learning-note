package com.nonfou.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class CardFactory implements Factory {

  private final List<Product> cards;

  public CardFactory() {
    cards = new ArrayList<>();
  }

  @Override
  public Product createProduct(String type) {
    return new Card(type);
  }

  @Override
  public void registerProduct(Product product) {
    cards.add(product);
  }
}
