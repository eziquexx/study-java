package studyjavachatgpt.day14;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    
    list.add("사과");
    list.add("바나나");
    list.add("사과"); // 중복 가능

    for (String item : list) {
      System.out.println(item);
    }
  }
}
