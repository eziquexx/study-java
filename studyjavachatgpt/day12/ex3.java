package studyjavachatgpt.day12;

import java.util.Scanner;

// 사용자로부터 숫자 두 개를 입력받아 나누기 연산을 수행
// 0으로 나누면 "0으로 나눌 수 없습니다" 출력

// 힌트: Scanner, try-catch, ArithmeticException 사용
public class ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    try {
      System.out.println("숫자 두 개를 입력 해주세요.");
      System.out.print("첫번째 숫자: ");
      int a = sc.nextInt();
      System.out.print("두번째 숫자: ");
      int b = sc.nextInt();
      int result = a / b;

      System.out.println("a 나누기 b는 " + result);
    } catch (ArithmeticException e) {
      System.out.println("0으로는 나눌 수 없습니다.");
    } finally {
      sc.close();
      System.out.println("프로그램 실행");
    }
  }
}
