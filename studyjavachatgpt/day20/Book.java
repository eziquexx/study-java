package studyjavachatgpt.day20;

import java.time.LocalDate;

public class Book {
  private String title;
  private String author;
  private LocalDate publishedDate;

  public Book(String title, String author, LocalDate publishedDate) {
    this.title = title;
    this.author = author;
    this.publishedDate = publishedDate;
  }

  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public LocalDate getPublishedDate() {
    return publishedDate;
  }

  @Override
  public String toString() {
    return "[" + title + "|" + author + "|" + publishedDate + "]";
  }

}
