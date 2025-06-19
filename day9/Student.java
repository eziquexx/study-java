package day9;

public class Student extends Person {
  int studentId;

  @Override
  void introduce() {
    super.introduce();
    System.out.println("학번은 " + studentId + "입니다.");
  }
}
