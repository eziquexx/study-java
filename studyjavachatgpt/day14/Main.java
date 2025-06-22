package studyjavachatgpt.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    List<String> food = new ArrayList<>();
    Set<Integer> num = new HashSet<>();
    Map<String, String> engWord = new HashMap<>();

    // List 실습: 음식 5개 추가 + 출력
    food.add("된장찌개");
    food.add("김치찌개");
    food.add("불고기");
    food.add("비빔밥");
    food.add("볶음밥");

    for (String item : food) {
      System.out.print(item + " ");
    }
    System.out.println();

    // Set 실습: 중복된 숫자 포함해 6개 추가 + 출력
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(5);
    num.add(7);
    num.add(1);

    for (Integer item : num) {
      System.out.print(item + " ");
    }
    System.out.println();

    // Map 실습: 3개 단어를 key로 넣고, 한글 뜻은 value로 넣기 + 출력
    engWord.put("apple", "사과");
    engWord.put("banana", "바나나");
    engWord.put("orange", "오렌지");

    System.out.println(engWord.keySet());
    System.out.println(engWord.values());

    // Map 실습2: Map에서 전체 key-value를 직접 출력
    for (String key : engWord.keySet()) {
      System.out.println(key + " : " + engWord.get(key));
    }
  }
}

