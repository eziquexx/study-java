package studyjavachatgpt.day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("./studyjavachatgpt/day18/output.txt"));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
