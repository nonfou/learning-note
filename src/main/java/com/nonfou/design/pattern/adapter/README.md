
`TextPrint` 为接口 `Print` 提供了一些基本实现

现提供了 `ImagePrintAdapter` 可以实现改变图片中的文字

```java
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
```

### 什么时候需要适用适配器模式

1. 利用原有功能

在原有系统中有些比较稳定的功能方法，例如 `TextPrint` 中的功能；
`ImagePrint` 实现对应的 `Print` 接口中的功能时，就可以利用 `TextPrint` 完成。

2. 功能不同版本适配

系统2.0版本增加了新的功能，我们需要对原有系统1.0进行升级。

方法本身完成的功能是不变的，只不过可能是更改了入参或更改了返回值。