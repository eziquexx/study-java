package studyjavachatgpt.day15.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("철수", 85));
    list.add(new Student("영희", 95));
    list.add(new Student("민수", 75));
    
    Collections.sort(list);

    for (Student s : list) {
      System.out.println(s); // 숫자 순으로 정렬되어 나옴
    }
  }
}
