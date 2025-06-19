package day11.ex4;

public class Main {
  public static void main(String[] args) {
    Swimmable[] swimmable = {new Fish(), new Human()};

    for (Swimmable s : swimmable) {
      s.swim();
    }
  }
}
