package com.example.librarybookmanager.service;

import com.example.librarybookmanager.exception.InvalidYearException;

public interface LibraryService {
  void registerBook() throws InvalidYearException;  // 책 등록
  void printBook();     // 책 목록
  void searchBook();    // 책 검색
  void deleteBook();    // 책 삭제
}
