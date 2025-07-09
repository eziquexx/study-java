package studyjavachatgpt.day17;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
  public static void main(String[] args) {
    // List<String> list = List.of("Java", "Spring", "Lambda", "Stream");
    List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");

    list.stream()
      .filter(s -> s.length() > 5)
      .sorted()
      .forEach(System.out::println);
  }
}
