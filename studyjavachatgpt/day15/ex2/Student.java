package studyjavachatgpt.day15.ex2;

public class Student implements Comparable<Student> { // Comparable<T> 제너릭 안에는 비교 대상의 타입
  String name;
  int score;

  // 생성자
  Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  // 정렬 기준 정의: 점수 오름차순
  // compareTo 메서드 재정의
  @Override
  public int compareTo(Student other) {
    return this.score - other.score; // this를 기준으로 other보다 음수면 앞에, 크면 뒤에 배치
  }

  public String toString() {
    return name + " (" + score + ")";
  }
}
