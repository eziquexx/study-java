package studyjavachatgpt.day22;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import studyjavachatgpt.day22.domain.Book;
import studyjavachatgpt.day22.io.FileHandler;
import studyjavachatgpt.day22.service.LibraryService;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Book> bookList = FileHandler.loadBooks();
    LibraryService service = new LibraryService(bookList);
  
    while (true) {
      System.out.println("1. 도서 등록 | 2. 도서 목록 | 3. 검색 | 4. 도서 이름 검색(출판연도기준) | 5. Optional 도서 검색 | 6. 삭제 | 7. 종료");
      String input = sc.nextLine();
  
      switch(input) {
        case "1":
          System.out.print("제목: ");
          String title = sc.nextLine();
          System.out.print("저자: ");
          String author = sc.nextLine();
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
          System.out.print("검색 도서명: ");
          String keyword = sc.nextLine();
          List<Book> result = service.findJavaBookSortedByYearDesc(keyword);
          for (Book b : result) {
            System.out.println(b);
          }
          break;
        case "5":
          System.out.print("검색 도서명: ");
          String title2 = sc.nextLine();
          Optional<Book> found = service.findByTitle(title2);

          found.ifPresent(System.out::println);
        case "6":
          System.out.print("삭제할 제목 입력: ");
          service.deleteByTitle(sc.nextLine());
          break;
        case "7":
          FileHandler.saveBook(service.getBooks());
          System.out.println("저장 후 종료합니다.");
          return;
      }
    }
  }
}
