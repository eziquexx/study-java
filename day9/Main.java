package day9;

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.sound(); // 멍멍!
    dog.callParentSound(); // 동물이 소리를 냅니다.

    Cat cat = new Cat();

    cat.sound();
  }
}
