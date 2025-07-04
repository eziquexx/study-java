package com.example.librarybookmanager;

import java.util.Scanner;

import com.example.librarybookmanager.constants.Message;
import com.example.librarybookmanager.service.LibraryServiceImpl;

public class LibraryBookManagerApplication {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      LibraryServiceImpl library = new LibraryServiceImpl();
  
      System.out.println(Message.TITLE);
      
      while (true) {
        System.out.println(Message.MENU);
        System.out.print("메뉴를 선택하세요: ");
        try {
          int choice = Integer.parseInt(sc.nextLine());
          System.out.println();
          
          switch (choice) {
            case 1 -> {
              library.registerBook();
            }
            case 2 -> {
              library.printBook();
            }
            case 3 -> {
              library.searchBook();
            }
            case 4 -> {
              library.deleteBook();
            }
            case 5 -> {
              System.out.println("프로그램을 종료합니다.");
              return;
            }
            default -> System.out.println("올바른 번호를 입력하세요.\n");
          } 
  
        } catch (Exception e) {
          System.out.println("숫자만 입력해주세요.\n");
        } 
      }

    }
  }
}
