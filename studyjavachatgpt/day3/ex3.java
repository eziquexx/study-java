package studyjavachatgpt.day3;

import java.util.ArrayList;

public class ex3 {
  public static void main(String[] args) {
    // 제네릭을 사용하면 **타입 안정성(type safety)**을 확보할 수 있기 때문에, 코드의 오류를 사전에 방지하고 컴파일 타임에서 타입 오류를 잡을 수 있다.
    // ArrayList<Book>의 <Book>은 이 리스트에 Book 객체만 추가되도록 제한한다.
    ArrayList<Book> library = new ArrayList<>();

    library.add(new Book("개미", "베르나르 베르베르"));
    library.add(new Book("데미안","헤르만 헤세"));

    for (Book b : library) {
      System.out.println(b);
    }
  }
}
