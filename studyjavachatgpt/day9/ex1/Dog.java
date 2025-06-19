package studyjavachatgpt.day9.ex1;

public class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("멍멍!");
  }

  void callParentSound() {
    super.sound(); // 부모 클래스의 sound 메서드 호출
  }
}
