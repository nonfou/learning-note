package com.nonfou.design.pattern.template.method;

public interface Display {

  void open();

  void print();

  void close();

  default void display() {
    open();
    print();
    close();
  }
}
