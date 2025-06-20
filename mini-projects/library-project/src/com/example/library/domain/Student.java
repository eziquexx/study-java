package com.example.library.domain;

public class Student extends User {
  // 생성자: Student 객체를 생성시 super, 부모 클래스를 빌려 생성
  public Student(String name, String id) {
    super(name, id);
  }

  // User클래스 상속받기 때문에 반드시 재정의 해야하는 함수
  @Override
  public void printInfo() {
    System.out.println("[학생] 이름: " + name + ", ID: " + id);
  }
}
