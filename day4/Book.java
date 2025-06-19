package day4;

public class Book {
  private String title;
  private String author;

  Book () { } // 기본 생성자

  Book (String title, String author) {
    this.title = title;
    this.author = author;
  }

  // setter, getter
  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  // 메서드
  public void printInfo() {
    System.out.println("제목: " + title + ", 저자: " + author);
  }

  @Override
  public String toString() {
    return "제목: " + title + ", 저자: " + author;
  }

  
}