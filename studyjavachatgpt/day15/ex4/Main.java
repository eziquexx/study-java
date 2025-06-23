package studyjavachatgpt.day15.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Student 객체 리스트 생성
    List<Student> students = new ArrayList<>();
    students.add(new Student("영희", 90));
    students.add(new Student("철수", 85));
    students.add(new Student("민수", 95));

    // 람다식으로 오름차순
    Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

    // 출력
    for (Student s : students) {
      System.out.println(s); // 민수, 영희, 철수. 이름 기준으로 정렬되어 출력
    }
  }
}
