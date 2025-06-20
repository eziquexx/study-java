package com.example.library.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements Loanable {
  protected String name;
  protected String id;
  protected List<Book> borrowedBooks = new ArrayList<>(); // 어떤 도서 대출했는지 목록

  // 생성자: 유저 등록(객체 생성)
  public User(String name, String id) {
    this.name = name;
    this.id = id;
  }  

  // 자식 객체가 반드시 재정의 해야할 메서드
  public abstract void printInfo();

  /* 
    interface 구현했기 때문에 반드시 재정의
    도서 대출 코드
  */ 
  @Override
  public void borowedBook(Book book) {
    // 도서가 있거나 대출하려는 책이 3권 미만이면 대출 가능
    if (!book.isBorrowed() && borrowedBooks.size() < 3) { 
      book.borrow(); // 대출했으니 도서 상태 대출 됐다고 변경
      borrowedBooks.add(book); // 해당 유저가 대출하는 도서를 도서대출목록에 추가
    } else {
      System.out.println("대출이 불가능합니다.");
    }
  }

  /* 
    interface 구현했기 때문에 반드시 재정의
    도서 반납 코드
  */ 
  @Override
  public void returnBook(Book book) {
    // 도서대출목록에 반납하려는 도서가 있으면 반납 처리
    if (borrowedBooks.contains(book)) {
      book.returnBook(); // 도서 반납
      borrowedBooks.remove(book); // 도서대출목록에서 해당 도서 제거
      System.out.println(name + "님이 " + book.getTitle() + "책을 반납하였습니다.");
    } else {
      System.out.println("해당 책은 대출 목록에 없습니다.");
    }
  }

  // 이름 가져오기
  public String getName() {
    return name;
  }
}
