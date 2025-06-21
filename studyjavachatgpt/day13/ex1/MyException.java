package studyjavachatgpt.day13.ex1;

public class MyException extends Exception {
  public MyException(String message) {
    super(message); // 부모(Exception) 클래스 생성자 호출
  }
}
