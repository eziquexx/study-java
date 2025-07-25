package studyjavachatgpt.day21;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import studyjavachatgpt.day21.domain.Book;
import studyjavachatgpt.day21.io.FileHandler;
import studyjavachatgpt.day21.service.LibraryService;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Book> bookList = FileHandler.loadBooks(); // 파일에 있는 도서 목록 전체 가져와서 리스트로 저장
    LibraryService service = new LibraryService(bookList);

    while (true) {
      System.out.println("1. 도서 등록 | 2. 도서 목록 | 3. 검색 | 4. 삭제 | 5. 종료");
      String input = sc.nextLine();
      
      switch (input) {
        case "1":
          System.out.print("제목: ");
          String title = sc.nextLine();
          System.out.print("저자: ");
          String author = sc.nextLine();
          System.out.print("출판일(yyyy-MM-dd): ");
          LocalDate date = LocalDate.parse(sc.nextLine());
          service.register(title, author, date);
          break;

        case "2":
          service.list();
          break;
  
        case "3":
          System.out.print("검색 키워드: ");
          service.searchByKeyword(sc.nextLine());
          break;
  
        case "4":
          System.out.print("삭제할 제목 입력: ");
          service.deleteByTitle(sc.nextLine());
          break;
  
        case "5":
          FileHandler.saveBooks(service.getBooks());
          System.out.println("저장 후 종료합니다.");
          return;
      }
    }

  }
}