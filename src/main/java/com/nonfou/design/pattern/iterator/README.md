
### 为什么使用迭代器模式，而不是直接遍历

对于`BookShelf`来说，如果我想遍历所有的书籍
```java
public class Main {
  public static void main(String[] args) {

    BookShelf bookShelf = new BookShelf();
    Iterator<Book> iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
```
不依赖于`BookShelf`本身如何存储`Book`, 示例中是使用 `java.util.List`

我想换成 `数组`、`java.util.Vector`、`java.util.Map` 依然不会影响已有的迭代代码，只需要更改`BookShelf`本身的一些实现即可

