package com.example.library.main;

import com.example.library.domain.*;
import com.example.library.service.LibraryService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    LibraryService library = new LibraryService();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // -------------------------------
    // 더미 도서 등록
    library.addBook(new Book("어린왕자", "생텍쥐페리"));
    library.addBook(new Book("1984", "조지 오웰"));
    library.addBook(new Book("데미안", "헤르만 헤세"));
    library.addBook(new Book("총 균 쇠", "재레드 다이아몬드"));
    library.addBook(new Book("자바의 정석", "남궁성"));

    // 더미 사용자 등록 (학생과 직원)
    library.addUser(new Student("홍길동", "stu01"));
    library.addUser(new Student("김철수", "stu02"));
    library.addUser(new Staff("이영희", "stf01"));
    library.addUser(new Staff("박민지", "stf02"));
    // -------------------------------

    // 동작 프로그램
    while (true) {
      System.out.println("\n1. 책 등록\n2. 사용자 등록\n3. 책 대출\n4. 책 반납\n5. 도서 목록 보기\n6. 종료");
      int choice = Integer.parseInt(br.readLine());

      switch (choice) {
        case 1: // 책 등록
          System.out.print("책 제목: ");
          String title = br.readLine();
          System.out.print("저자: ");
          String author = br.readLine();
          library.addBook(new Book(title, author));
          break;

        case 2: // 사용자 등록
          System.out.print("이름: ");
          String name = br.readLine();
          System.out.print("ID: ");
          String id = br.readLine();
          System.out.print("학생이면 1, 직원이면 2: ");
          int type = Integer.parseInt(br.readLine());
          if (type == 1) {
            library.addUser(new Student(name, id));
          } else {
            library.addUser(new Staff(name, id));
          }
          break;

        case 3: // 책 대출
          System.out.print("사용자 이름 입력: ");
          String borrower = br.readLine();
          System.out.print("대출할 책 제목 입력: ");
          String bookTitle = br.readLine();
          // 등록된 사용자인지 확인
          for (User user : library.getUsers()) {
            if (user.getName().equals(borrower)) {
              for (Book book : library.getBooks()) {
                if (book.getTitle().equals(bookTitle)) {
                  user.borowedBook(book);
                  System.out.println(user.getName() + "님 " + book.getTitle() + " 책 대출이 완료 되었습니다.");
                }
              }
            }
          }
          break;

        case 4: // 책 반납
          System.out.print("사용자 이름 입력: ");
          String returner = br.readLine();
          System.out.print("반납할 책 제목 입력: ");
          String returnBookTitle = br.readLine();
          for (User user : library.getUsers()) {
            if (user.getName().equals(returner)) {
              for (Book book : library.getBooks()) {
                if (book.getTitle().equals(returnBookTitle)) {
                  user.returnBook(book);
                }
              }
            }
          }
          break;

        case 5: // 도서 목록 보기
          library.printBooks();
          break;

        case 6: // 프로그램 종료
          System.out.println("시스템 종료");
          return;

        default: // 예외 처리
          System.out.println("메뉴 1~6 중 선택해주세요.");
      }
    }

  }
}
