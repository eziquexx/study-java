package studyjavachatgpt.day10.ex2;

public class Main {
  public static void main(String[] args) {
    Shape[] shape = new Shape[2];
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    
    shape[0] = circle;
    shape[1] = rectangle;

    for (int i = 0; i < shape.length; i++) {
      shape[i].draw();

      if (shape[i] instanceof Circle) {
        Circle c = (Circle) shape[i];
        c.drawCircleOnly();
      }
    }
  }
}
