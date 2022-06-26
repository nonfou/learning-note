package com.nonfou.design.pattern.adapter;

public class ImagePrint implements Print {

  private ImagePrintAdapter imagePrintAdapter;

  @Override
  public void showWithRed() {
    imagePrintAdapter.showWithRed();
  }

  @Override
  public void showWithGreen() {
    imagePrintAdapter.showWithGreen();
  }

  public ImagePrintAdapter getImagePrintAdapter() {
    return imagePrintAdapter;
  }

  public void setImagePrintAdapter(ImagePrintAdapter imagePrintAdapter) {
    this.imagePrintAdapter = imagePrintAdapter;
  }
}
