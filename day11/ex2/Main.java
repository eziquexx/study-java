package day11.ex2;

public class Main {
  public static void main(String[] args) {
    Flyable f = new Bird(); // 업캐스팅
    f.fly();
  }
}
