package studyjavachatgpt.day17;

import java.util.List;

public class Practice1 {
  public static void main(String[] args) {
    List<String> animals = List.of("cat", "tiger", "lion", "elephant", "dog");

    animals.stream()
      .filter(s -> s.length() >= 5)
      .forEach(System.out::println);
  }
}
