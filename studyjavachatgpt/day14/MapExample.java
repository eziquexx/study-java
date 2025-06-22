package studyjavachatgpt.day14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("apple", "사과");
    map.put("banana", "바나나");
    map.put("apple", "애플"); // 같은 키는 덮어씀

    System.out.println(map.get("apple")); // 애플이 출력됨
  }
}
