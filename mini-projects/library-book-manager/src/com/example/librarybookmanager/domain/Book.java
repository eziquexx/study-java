package com.example.librarybookmanager.domain;

public class Book {
  private String title;
  private String author;
  private int year;

  // 도서 등록 객체
  public Book(String title, String author, int year) {
    this.title = title;
    this.author= author;
    this.year = year;
  }

  // 책 제목으로 도서 검색
  public String getTitle() {
    return title;
  }

  // 책 저자로 도서 검색
  public String getAuthor() {
    return author;
  }

  // 연도별로 도서 검색
  public int getYear() {
    return year;
  }
  
  @Override
  public String toString() {
    return title + " (" + author + ", " + year + ")";
  }
  
}
