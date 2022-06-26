package com.nonfou.design.pattern.adapter;

public class Main {

  public static void main(String[] args) {

    TextPrint textPrint = new TextPrint();

    ImagePrintAdapter adapter = new ImagePrintAdapter(textPrint);

    ImagePrint imagePrint = new ImagePrint();
    imagePrint.setImagePrintAdapter(adapter);

    imagePrint.showWithGreen();
    imagePrint.showWithRed();

  }
}
