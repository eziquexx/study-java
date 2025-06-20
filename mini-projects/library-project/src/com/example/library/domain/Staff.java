package com.example.library.domain;

public class Staff extends User {
  // 생성자: name, id 파라미터가 있는 생성자.
  public Staff(String name, String id) {
    super(name, id);
  }

  // 반드시 재정의 해야하는 함수
  @Override
  public void printInfo() {
    System.out.println("[직원]이름: " + name + ", ID: " + id);
  }
}
