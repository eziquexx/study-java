package studyjavachatgpt.day18;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("./studyjavachatgpt/day18/output.txt");
      writer.write("Hello, Java!\n");
      writer.write("파일 입출력 연습 중입니다.");
      writer.close(); // 꼭 닫아줘야 데이터가 저장됨
    } catch (IOException e) {
      e.printStackTrace(); // 예외가 발생했을 때, 예외가 발생한 경로(스택 트레이스)를 출력해주는 메서드. 주로 디버깅 용도로 사용.
    }
  }
}
