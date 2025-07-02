package com.example.librarybookmanager.comparator;

import java.util.Comparator;

import com.example.librarybookmanager.domain.Book;

public class BookYearComparator implements Comparator<Book> {
  @Override
  public int compare(Book b1, Book b2) {
    return Integer.compare(b1.getYear(), b2.getYear());
  }
}
