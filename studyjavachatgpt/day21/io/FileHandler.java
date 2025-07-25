package studyjavachatgpt.day21.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import studyjavachatgpt.day21.domain.Book;

public class FileHandler {
  // 파일 경로
  private static final String FILE_PATH = "./studyjavachatgpt/day21/books.txt";

  // 도서 불러오기
  public static List<Book> loadBooks() {
    // 책 리스트로 관리
    List<Book> books = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"))) {
      String line;
      while ( (line = br.readLine()) != null) {
        String[] parts = line.split(", "); // , 기준으로 나누어 parts에 배열형태로 저장
        if (parts.length == 3) {
          books.add(new Book(parts[0], parts[1], LocalDate.parse(parts[2])));
        }
      }
    } catch (IOException e) {
      System.out.println("파일 로딩 실패: " + e.getMessage());
    }

    return books;
  }

  // 도서 저장
  public static void saveBooks(List<Book> books) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
      for (Book b : books) {
        bw.write(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPublishedDate());
        bw.newLine(); // 줄바꿈
      }
    } catch (IOException e) {
      System.out.println("파일 저장 실패: " + e.getMessage());
    }
  }
}
