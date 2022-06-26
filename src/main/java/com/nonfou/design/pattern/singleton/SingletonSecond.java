package com.nonfou.design.pattern.singleton;

public class SingletonSecond {
  private SingletonSecond() {}

  private static SingletonSecond instance = null;

  public static SingletonSecond getInstance() {
    if (instance == null) {
      synchronized (SingletonSecond.class) {
        instance = new SingletonSecond();
      }
    }

    return instance;
  }
}
