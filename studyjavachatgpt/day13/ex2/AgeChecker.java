package studyjavachatgpt.day13.ex2;

public class AgeChecker {
  public static void checkAge(int age) throws AgeException {
    if (age < 0) {
      throw new AgeException("나이는 음수가 될 수 없습니다.");
    } else {
      System.out.println("나이: " + age);
    }
  }

  public static void main(String[] args) {
    try {
      checkAge(-5); // 여기서 예외 발생
    } catch (AgeException e) {
      System.out.println("예외 발생: " + e.getMessage());
    }
  }
}
