package studyjavachatgpt.day13.ex3;

import java.util.Scanner;

public class ScoreChecker {
  public static void checkScore(int score) throws ScoreException {
    if (score < 0 || score > 100) {
      throw new ScoreException("0보다 작거나 100보다 커야 합니다.");
    } else {
      System.out.println("점수는 정상입니다.");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    try {
      int score = sc.nextInt();
      checkScore(score);
    } catch (ScoreException e) {
      System.out.println("예외 발생: " + e.getMessage());
    } finally {
      sc.close();
    }
  }
}
