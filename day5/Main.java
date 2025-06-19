package day5;

public class Main {
  public static void main(String[] args) {
    Book book = new Book("자바의 정석", "남궁성");

    // Getter 사용
    System.out.println("책 제목: " + book.getTitle());

    // Setter 사용
    book.setTitle("Effective Java");
    book.setAuthor("조슈아 블로크");

    // 출력 확인
    book.printInfo();
  }
}
