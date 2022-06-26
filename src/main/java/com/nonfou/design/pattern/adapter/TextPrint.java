package com.nonfou.design.pattern.adapter;

public class TextPrint implements Print {

  @Override
  public void showWithRed() {
    System.out.println("字体变为红色");
  }

  @Override
  public void showWithGreen() {
    System.out.println("字体变为绿色");
  }
}
