package com.example.library.domain;

public class Book {
  private String title;
  private String author;
  private boolean isBorrowed = false; // 기본 대출 상태 (false: 가능, true: 불가)

  // 생성자: 도서 등록
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  } 

  // 도서 대출
  public void borrow() {
    isBorrowed = true;
  }
  
  // 도서 반납
  public void returnBook() {
    isBorrowed = false;
  }

  // 도서 가능 상태
  public boolean isBorrowed() {
    return isBorrowed;
  }

  // 도서 제목 검색
  public String getTitle() {
    return title;
  }

  // 도서 저자 검색
  public String getAuthor() {
    return author;
  }

}