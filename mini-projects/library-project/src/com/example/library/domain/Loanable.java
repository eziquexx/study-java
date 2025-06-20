package com.example.library.domain;

public interface Loanable {
  void borowedBook(Book book); // 어떤 책 대출하는지
  void returnBook(Book book); // 어떤 책 반납하는지
}
