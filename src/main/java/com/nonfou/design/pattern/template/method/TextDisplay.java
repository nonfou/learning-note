package com.nonfou.design.pattern.template.method;

public class TextDisplay implements Display {
  @Override
  public void open() {
    System.out.println("open");
  }

  @Override
  public void print() {
    System.out.println("print text");
  }

  @Override
  public void close() {
    System.out.println("close");
  }
}
