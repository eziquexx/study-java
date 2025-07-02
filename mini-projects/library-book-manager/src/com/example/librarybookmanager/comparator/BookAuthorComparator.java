package com.example.librarybookmanager.comparator;

import java.util.Comparator;

import com.example.librarybookmanager.domain.Book;

public class BookAuthorComparator implements Comparator<Book> {
  @Override
  public int compare(Book b1, Book b2) {
    return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
  }
}
