package studyjavachatgpt.day17;

import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda {
  public static void main(String[] args) {
    // 기본 형태
    Runnable r = () -> System.out.println("Hello Lambda!");
    r.run();
    
    // 매개변수 있는 경우
    Consumer<String> c = (s) -> System.out.println("입력값: " + s);
    c.accept("테스트");

    // Comparator 예시 (기존 익명 클래스 대체)
    Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    System.out.println(comp);
  }
}
