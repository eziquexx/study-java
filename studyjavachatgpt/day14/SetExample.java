package studyjavachatgpt.day14;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("사과");
    set.add("바나나");
    set.add("사과"); // 중복 무시됨

    for (String item : set) {
      System.out.println(item);
    }
  }
}
