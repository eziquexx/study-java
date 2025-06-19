package day11.ex1;

public class Main {
  public static void main(String[] args) {
    Animal a = new Dog(); // 업캐스팅

    a.sound();
    a.eat();
  }
}
