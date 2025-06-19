package studyjavachatgpt.day10.ex2;

public class Circle extends Shape {
  @Override
  void draw() {
    System.out.println("원형");
  }

  void drawCircleOnly() {
    System.out.println("Circle만의 메서드");
  }
}
