package studyjavachatgpt.day2.ex2;

public class Student {
  String name;
  int age;
  int studentId;

  Student (String name, int age, int studentId) {
    this.name = name;
    this.age = age;
    this.studentId = studentId;
  }

  void introduce() {
    System.out.println("안녕하세요. 제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다.");
  }
  void printStudentId() {
    System.out.println("제 학번은 " + studentId + "입니다.");
  }
}