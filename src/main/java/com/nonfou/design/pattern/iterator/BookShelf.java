package com.nonfou.design.pattern.iterator;

import java.util.List;

public class BookShelf {

  private List<Book> books;

  public int getLength() {
    return books.size();
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;

    for (Book book : getBooks()) {
      System.out.println(book.getName());
    }
  }
}
