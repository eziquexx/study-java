package com.example.librarybookmanager.service;

public interface LibraryService {
  void registerBook();  // 책 등록
  void printBook();     // 책 목록
  void searchBook();    // 책 검색
  void deleteBook();    // 책 삭제
}
