package day2.ex3;

public class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  void printInfo() {
    System.out.println("제목: " + title + ", 저자: " + author);
  }
}