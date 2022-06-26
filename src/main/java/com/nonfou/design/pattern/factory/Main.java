package com.nonfou.design.pattern.factory;

public class Main {
  public static void main(String[] args) {
    Factory cardFactory = new CardFactory();
    Product product = cardFactory.create("card");
  }
}
