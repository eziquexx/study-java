package studyjavachatgpt.day20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class LibraryService {
  private List<Book> books = new ArrayList<>();

  // 책 추가
  public void addBook(Book book) {
    // String line = book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublishedDate();
    // String[] parts = line.split(", ");
    // LocalDate date = LocalDate.parse(parts[2]);
    // books.add(new Book(parts[0], parts[1], date));

    books.add(book);
    System.out.println("등록된 책: " + book);
  }

  // 연도 기준 검색
  public void searchAfterYear(int year) {
    for (Book b : books) {
      if (b.getPublishedDate().getYear() > year) {
        System.out.println(b);
      }
    }
  }

  // 키워드 포함 검색
  public void searchByKeyword(String keyword) {
    for (Book b : books) {
      if (b.getTitle().contains(keyword) || b.getAuthor().contains(keyword)) {
        System.out.println(b);
      }
    }
  }
}
