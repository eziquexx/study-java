package studyjavachatgpt.day15.ex5;

public class Book implements Comparable<Book> {
  String title;
  int year;

  public Book(String title, int year) {
    this.title = title;
    this.year = year;
  }

  @Override
  public int compareTo(Book other) {
    return this.year - other.year; // 오름차순
  }

  public String toString() {
    return title + "( " + year + "년)";
  }
}
