package studyjavachatgpt.day18.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadBook {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("./studyjavachatgpt/day18/ex1/books.txt"));

      //Book 객체로 리스트에 저장.
      List<Book> bookList = new ArrayList<>();

      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(", ");
        if (parts.length == 3) {
          Book book = new Book(parts[0], parts[1], parts[2]);
          bookList.add(book);
        }
      }

      for (Book book : bookList) {
        System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 출판연도: " + book.getYear());
      }
      br.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
