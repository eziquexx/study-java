package studyjavachatgpt.day3;

public class ex1 {
  public static void main (String[] args) {
    Book[] books = new Book[5];

    books[0] = new Book("개미", "베르나르 베르베르");
    books[1] = new Book("데미안", "헤르만 헤세");
    books[2] = new Book("어린왕자", "생텍쥐페리");
    books[3] = new Book("나미야 잡화점의 기적", "히가시노 게이고");
    books[4] = new Book("죽음에 관하여", "어니스트 베커");

    for (Book book : books) {
      book.printInfo();
    }
  }
}