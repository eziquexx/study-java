package studyjavachatgpt.day19;

import java.util.Scanner;

import studyjavachatgpt.day19.domain.Book;
import studyjavachatgpt.day19.exception.FileProcessingException;
import studyjavachatgpt.day19.service.LibraryService;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LibraryService service = new LibraryService();

    // 책 읽어와 리스트로 저장
    try {
      service.loadBooks();
    } catch (FileProcessingException e) {
      System.out.println(e.getMessage());
    }

    // 프로그램
    while (true) {
      System.out.println("1. 도서 등록 | 2. 도서 목록 | 3. 종료");
      String input = sc.nextLine();

      switch (input) {
        case "1" : // 도서 등록
          System.out.print("제목: ");
          String title = sc.nextLine();
          System.out.print("저자: ");
          String author = sc.nextLine();
          System.out.print("출판연도: ");
          String year = sc.nextLine();
          
          try {
            service.addBook(new Book(title, author, year));
            System.out.println("등록 성공!");
          } catch (FileProcessingException e) {
            System.out.println(e.getMessage());
          }
          break;
        
        case "2" : // 도서 목록
          service.printBooks();
          break;

        case "3" : // 종료
          System.out.println("종료합니다.");
          return;

        default :
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
