package day4;

public class Book2 {
  private String title;
  private String author;

  // 생성자 함수
  public Book2() {}
  public Book2(String title, String author) {
    this.title = title;
    this.author = author;
  };

  // getter, setter
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // method
  public void printInfo() {
    System.out.println("제목: " + title + ", 저자: " + author);
  }
}
