package day7;

public class Book {
  String title;
  String author;

  // 생성자 1
  Book() {
    this.title = "제목 없음";
    this.author = "저자 없음";
  }

  // 생성자 2
  Book(String title) {
    this.title = title;
    this.author = "저자 없음";
  }

  // 생성자 3
  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  void printInfo() {
    System.out.println("제목: " + title + ", 저자: " + author);
  }

}
