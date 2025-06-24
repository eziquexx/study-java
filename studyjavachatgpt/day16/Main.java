package studyjavachatgpt.day16;

public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    System.out.println(MathUtil.add(a, b));
    System.out.println(MathUtil.subtract(a, b));
    System.out.println(MathUtil.multiply(a, b));
    System.out.println(MathUtil.divide(a, b));

    System.out.println("===============");

    System.out.println(Constants.PI);
    System.out.println(Constants.MAX_USER);
  }
}
