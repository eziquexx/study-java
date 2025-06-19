package day7;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book();
    Book book2 = new Book("해리포터");
    Book book3 = new Book("1984", "조지 오웰");

    book1.printInfo();
    book2.printInfo();
    book3.printInfo();
  }
}
