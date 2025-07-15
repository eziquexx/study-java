package studyjavachatgpt.day19.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import studyjavachatgpt.day19.domain.Book;
import studyjavachatgpt.day19.exception.FileProcessingException;

public class LibraryService {
  private List<Book> books = new ArrayList<>();
  private final String FILE_PATH = "./studyjavachatgpt/day19/data/books.txt";

  // 책 리스트로 저장
  public void loadBooks() throws FileProcessingException {
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH) )) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(", ");
        if (parts.length == 3) {
          books.add(new Book(parts[0], parts[1], parts[2]));
        }
      }
    } catch (IOException e) {
      throw new FileProcessingException("파일을 읽는 중 오류 발생");
    }
  }

  // 책 추가
  public void addBook(Book book) throws FileProcessingException {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
      bw.write(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
      bw.newLine();
      books.add(book);
    } catch (IOException e) {
      throw new FileProcessingException("파일을 저장하는 중 오류 발생");
    }
  }

  // 책 출력
  public void printBooks() {
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
