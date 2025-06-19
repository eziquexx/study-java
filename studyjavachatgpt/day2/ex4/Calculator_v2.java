package studyjavachatgpt.day2.ex4;

public class Calculator_v2 {

  // Stateless 설계
  
  int add(int a, int b) {
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int multiply(int a, int b) {
    return a * b;
  }
  
  double divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("0으로 나눌 수 없습니다.");
    }
    return (double) a / b;
  }
}
