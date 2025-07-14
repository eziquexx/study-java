package studyjavachatgpt.day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadFormFile {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("./studyjavachatgpt/day18/memo.txt"));
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("읽은 내용: " + line);
      }
      br.close();
    } catch (IOException e) {
      System.out.println("파일 읽기 실패: " + e.getMessage());
    }
  }
}
