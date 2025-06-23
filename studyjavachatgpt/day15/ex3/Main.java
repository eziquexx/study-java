package studyjavachatgpt.day15.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Student 객체 리스트 생성
    List<Student> students = new ArrayList<>();
    students.add(new Student("영희", 90));
    students.add(new Student("철수", 85));
    students.add(new Student("민수", 95));

    // 이름 기준 오름차순 정렬 (Comparator 사용) - 정렬을 계산하는 메서드만 있는 객체일 뿐
    Comparator<Student> nameComparator = new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // 이름 기준 정렬
      }
    };

    // 정렬 적용
    Collections.sort(students, nameComparator);

    // 출력
    for (Student s : students) {
      System.out.println(s); // 민수, 영희, 철수. 이름 기준으로 정렬되어 출력
    }
  }
}
