package com.example.library.service;

import java.util.ArrayList;
import java.util.List;

import com.example.library.domain.*;

public class LibraryService {
  private List<Book> books = new ArrayList<>();
  private List<User> users = new ArrayList<>();

  // 책 등록
  public void addBook(Book book) {
    books.add(book); // 도서목록에 책 추가
    System.out.println("책 등록 완료: " + book.getTitle());
  }

  // 사용자 등록
  public void addUser(User user) {
    users.add(user); // 사용자목록에 사용자 추가
    System.out.println("사용자 등록 완료: " + user.getName());
  }

  // 일반 메서드: 대출가능 여부까지 포함된 도서목록 전체 조회
  public void printBooks() {
    for (Book book : books) {
      System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 상태: " + (book.isBorrowed() ? "대출중" : "대출가능"));
    }
  }

  // Getter: 도서목록 전체 조회
  public List<Book> getBooks() {
    return books;
  }

  // Getter: 사용자목록 전제 조회
  public List<User> getUsers() {
    return users;
  }
}