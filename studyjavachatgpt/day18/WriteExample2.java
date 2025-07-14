package studyjavachatgpt.day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample2 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("./studyjavachatgpt/day18/파일경로", true)); // true는 append
      bw.write("문자열");
      bw.newLine(); // 줄바꿈
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
