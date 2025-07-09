package studyjavachatgpt.day17;

import java.util.List;

public class Ex2 {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 5, 10, 15, 20, 25);

    // 10 이상인 수만 필터링해서 출력
    numbers.stream()
      .filter(n -> n >= 10)
      .forEach(System.out::println);
  }
}
