package studyjavachatgpt.day12;

public class ex1 {
  public static void main(String[] args) {
    try {
      int result = 10 / 0; // 여기서 예외 발생
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
  }
}
