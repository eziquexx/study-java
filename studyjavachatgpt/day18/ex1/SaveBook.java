package studyjavachatgpt.day18.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveBook {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("./studyjavachatgpt/day18/ex1/books.txt", true));
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("제목, 저자, 출판연도 입력해주세요.");
      System.out.print("제목: ");
      String bookTitle = br.readLine();
      System.out.print("저자: ");
      String bookAuthor = br.readLine();
      System.out.print("출판연도: ");
      String bookYear = br.readLine();

      bw.write(bookTitle + ", " + bookAuthor + ", " + bookYear);
      bw.newLine(); // 줄바꿈
      br.close();
      bw.close();

      System.out.println("파일 저장 성공");
    } catch (IOException e) {
      System.out.println("파일저장 실패: " + e.getMessage());
    }
  }
}
