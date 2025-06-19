package studyjavachatgpt.day10.ex1;

public class Main {
  public static void main(String[] args) {
    Animal a1 = new Dog(); // 업캐스팅
    Animal a2 = new Cat(); // 업캐스팅

    a1.sound();
    a2.sound();

    Animal animal = new Dog(); 
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.sound(); // 멍멍!
    }
  }
}
