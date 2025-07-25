package studyjavachatgpt.day21.service;

import java.time.LocalDate;
import java.util.List;

import studyjavachatgpt.day21.domain.Book;

public class LibraryService {
  private List<Book> books;

  // 생성자
  public LibraryService(List<Book> books) {
    this.books = books;
  }

  // 도서 등록
  public void register(String title, String author, LocalDate date) {
    books.add(new Book(title, author, date));
    System.out.println("도서 등록 완료!");
  }

  // 도서 목록
  public void list() {
    books.forEach(System.out::println);
  }

  // 도서 키워드 검색
  public void searchByKeyword(String keyword) {
    for (Book b : books) {
      if (b.getTitle().contains(keyword) || b.getAuthor().contains(keyword)) {
        System.out.println(b);
      }
    }
  }

  // 도서 제목 기준 삭제
  public void deleteByTitle(String title) {
    books.removeIf(b -> b.getTitle().equals(title));
    System.out.println("삭제 완료!");
  }

  // 도서 전체 목록
  public List<Book> getBooks() {
    return books;
  }
}
