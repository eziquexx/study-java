package day2.ex4;

public class Calculator {
  int a;
  int b;

  Calculator(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void add() {
    System.out.println(a + b);
  }

  void subtract() {
    System.out.println(a - b);
  }

  void multiply() {
    System.out.println(a * b);
  }

  // void divide() {
  //   System.out.println(a / b);
  // }
  void divide() {
    if (b != 0) {
      System.out.println((double) a / b);
    } else {
      System.out.println("0으로 나눌 수 없습니다.");
    }
  }
}