package day2.ex4;

public class Main {
  public static void main(String[] args) {
    Calculator cal = new Calculator(6, 5);

    cal.add();
    cal.subtract();
    cal.multiply();
    cal.divide();

    // Stateless 설계
    Calculator_v2 cal_v2 = new Calculator_v2();
    System.out.println(cal_v2.add(1, 4));
    System.out.println(cal_v2.subtract(1, 4));
    System.out.println(cal_v2.multiply(1, 4));
    System.out.println(cal_v2.divide(1, 4));
  
  }

}
