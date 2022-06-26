package com.nonfou.design.pattern.singleton;

public class SingletonFirst {
  private SingletonFirst() {}

  private static final class SingletonFirstHolder {
    private static final SingletonFirst instance = new SingletonFirst();
  }

  public static SingletonFirst getInstance() {
    return SingletonFirstHolder.instance;
  }

}
