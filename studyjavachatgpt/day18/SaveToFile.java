package studyjavachatgpt.day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveToFile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("저장할 내용을 입력하세요: ");
    String input = sc.nextLine();
    sc.close();

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("./studyjavachatgpt/day18/memo.txt", true));
      bw.write(input);
      bw.newLine();
      bw.close();
      System.out.println("저장 완료!");
    } catch (IOException e) {
      System.out.println("파일 저장 실패: " + e.getMessage());
    }
  }
}
