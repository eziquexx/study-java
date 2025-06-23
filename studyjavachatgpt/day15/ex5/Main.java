package studyjavachatgpt.day15.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Java 입문 가이드", 2018));
    books.add(new Book("Effective Java", 2020));
    books.add(new Book("알고리즘 문제 해결 전략", 2016));
    books.add(new Book("클린 코드", 2010));
    books.add(new Book("모던 자바 인 액션", 2021));

    // 출판 연도 기준 오름차순 출력
    System.out.println("---------- 출판 연도 기준 오름차순 출력 ----------");
    Collections.sort(books);
    for (Book b : books) {
      System.out.println(b);
    }

    // 제목 기준 내림차순 출력 - Comparator 사용
    System.out.println("---------- 제목 기준 내림차순 출력 ----------");
    Comparator<Book> nameComparator = new Comparator<Book>() {
      @Override
      public int compare(Book b1, Book b2) {
        return b2.title.compareTo(b1.title);
      }
    };
    Collections.sort(books, nameComparator);
    for (Book b : books) {
      System.out.println(b);
    }
    
    // 제목 기준 내침차순 출력 - 람다식으로
    System.out.println("---------- 제목 기준 내림차순 출력 - 람다식 계산 ----------");
    Collections.sort(books, (b1, b2) -> b2.title.compareTo(b1.title));
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
