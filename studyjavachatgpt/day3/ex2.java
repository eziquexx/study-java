package studyjavachatgpt.day3;

public class ex2 {
  public static void main(String[] args) {
    Book[] books = new Book[4];

    books[0] = new Book(); // 꼭 객체를 생성해주기
    books[0].setTitle("개미");
    books[0].setAuthor("베르나르 베르베르");

    books[0].printInfo();
  }
}
