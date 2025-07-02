package com.example.librarybookmanager.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.example.librarybookmanager.constants.Message;
import com.example.librarybookmanager.domain.Book;
import com.example.librarybookmanager.exception.InvalidYearException;

public class LibraryServiceImpl implements LibraryService {
  private List<Book> books = new ArrayList<>(); // 책 list로 관리
  private Scanner sc = new Scanner(System.in); // 입력 받기

  // 책 등록
  @Override
  public void registerBook() {
    try {
      System.out.print("책 제목: ");
      String title = sc.nextLine();

      System.out.print("저자: ");
      String author = sc.nextLine();

      System.out.print("출판 연도: ");
      int year = Integer.parseInt(sc.nextLine());

      if (year < 0) { // 연도가 음수이면 예외처리
        throw new InvalidYearException(Message.ERROR_INVALID_YEAR);
      }

      books.add(new Book(title, author, year)); // 책 추가
      System.out.println(Message.SUCCESS_ADD + "\n");
    } catch (InvalidYearException e) {
      System.out.println("예외 발생: " + e.getMessage() + "\n");
    } catch (Exception e) {
      System.out.print(Message.ERROR_INPUT + "\n");
    }
  }

  // 책 목록
  @Override
  public void printBook() {
    if (books.isEmpty()) { // 책이 없으면 예외처리
      System.out.println(Message.NO_BOOKS + "\n");
      return;
    }

    // 기본 연도별로 출력
    Collections.sort(books, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));

    System.out.println("전체 도서 목록:");
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println();
  }

  // 책 검색
  @Override
  public void searchBook() {
    System.out.print("검색할 제목 또는 저자: ");
    String keyword = sc.nextLine().toLowerCase();

    boolean found = false;
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(keyword) ||
          book.getAuthor().toLowerCase().contains(keyword)) {
            System.out.println(book.toString());
            found = true;
      }
    }

    if (!found) {
      System.out.println(Message.BOOK_NOT_FOUND + "\n");
    } else {
      System.out.println();
    }
  }

  // 책 삭제
  @Override
  public void deleteBook() {
    System.out.print("삭제할 책 제목 입력: ");
    String title = sc.nextLine();

    boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
    if (removed) {
      System.out.println(Message.SUCCESS_DELETE + "\n");
    } else {
      System.out.println(Message.BOOK_NOT_FOUND + "\n");
    }
  }

}
