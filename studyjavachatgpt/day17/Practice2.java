package studyjavachatgpt.day17;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("제목3", "작가3", 2001));
    books.add(new Book("제목1", "작가1", 2000));
    books.add(new Book("제목2", "작가2", 1991));

    // 출판 연도 기준 정렬
    books.sort( (s1, s2) -> s1.getYear() - s2.getYear() );
    for (Book book : books) {
      System.out.println(book);
    } 

    // 제목 기준 정렬
    books.sort( (s1, s2) -> s1.getTitle().compareTo(s2.getTitle()) );
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
