package studyjavachatgpt.day22.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import studyjavachatgpt.day22.domain.Book;
import studyjavachatgpt.day22.io.FileHandler;


public class LibraryService {
  private List<Book> books;

  // 생성자
  public LibraryService(List<Book> books) {
    this.books = books;
  }

  // 도서 등록
  public void register(String title, String author, LocalDate publishedDate) {
    books.add(new Book(title, author, publishedDate));
    FileHandler.saveBook(books);
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

  // 도서 제목 + 출판 연도 기준 내림차순으로 정렬
  public List<Book> findJavaBookSortedByYearDesc(String title) {
    return books.stream()
      .filter(book -> book.getTitle().contains(title))
      .sorted(Comparator.comparing(Book::getPublishedDate).reversed())
      .collect(Collectors.toList());
  }

  // 도서 제목 Optional 사용으로 검색
  public Optional<Book> findByTitle(String title) {
    return books.stream()
      .filter(book -> book.getTitle().equals(title))
      .findFirst();
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
