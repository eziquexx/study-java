package studyjavachatgpt.day20;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LibraryService service = new LibraryService();
    Scanner sc = new Scanner(System.in);

    // 더미데이터
    service.addBook(new Book("바람이 분다. 당신이 좋다", "김수현", LocalDate.of(2018, 5, 14)));
    service.addBook(new Book("고양이와 철학자", "이지은", LocalDate.of(2020, 9, 30)));
    service.addBook(new Book("코드의 정석", "박진수", LocalDate.of(2022, 1, 10)));
    service.addBook(new Book("별빛 아래서", "정하윤", LocalDate.of(2019, 12, 3)));
    service.addBook(new Book("미래의 독서", "한지원", LocalDate.of(2021, 4, 22)));

    System.out.println("1. 도서 등록 | 2. 도서 목록 | 3. 연도별 검색 | 4. 키워드 검색 | 5. 종료");
    String input = sc.nextLine();

    switch (input) {
      case "3" :
        System.out.print("몇 년 이후 책을 찾을까요: ");
        int year = Integer.parseInt(sc.nextLine());
        service.searchAfterYear(year);
        break;
      case "4" :
        System.out.print("검색 키워드 입력: ");
        String keyword = sc.nextLine();
        service.searchByKeyword(keyword);
        break;
    }

    sc.close();
  }
}
