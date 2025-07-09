package studyjavachatgpt.day17;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Java", "Stream", "Lambda", "API", "Function");

    // 문자열 길이 기준 오름차순 정렬
    words.sort( (a,b) -> a.length() - b.length() );

    for (String word : words) {
      System.out.println(word);
    }
  }
}
