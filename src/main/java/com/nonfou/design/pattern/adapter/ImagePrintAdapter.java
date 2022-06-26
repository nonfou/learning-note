package com.nonfou.design.pattern.adapter;

public class ImagePrintAdapter implements Print {

  private final Print textPrint;

  public ImagePrintAdapter(Print textPrint) {
    this.textPrint = textPrint;
  }

  @Override
  public void showWithRed() {
    // 图片中的字体改为红色
    textPrint.showWithRed();
  }

  @Override
  public void showWithGreen() {
    // 图片中的字体改为绿色
    textPrint.showWithGreen();
  }
}
