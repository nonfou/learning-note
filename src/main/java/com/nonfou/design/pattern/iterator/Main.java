package com.nonfou.design.pattern.iterator;

public class Main {
  public static void main(String[] args) {

    BookShelf bookShelf = new BookShelf();
    Iterator<Book> iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
