package com.nonfou.design.pattern.singleton;

public enum SingletonEnum {

  INSTANCE;

  public void doSomething() {
    System.out.println("");
  }

  public static void main(String[] args) {
    SingletonEnum.INSTANCE.doSomething();
  }
}
