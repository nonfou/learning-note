package com.nonfou.design.pattern.iterator;

public class BookShelfIterator implements Iterator<Book>{

  private final BookShelf bookShelf;

  private int index = 0;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public boolean hasNext() {
    return bookShelf.getLength() > index;
  }

  @Override
  public Book next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
