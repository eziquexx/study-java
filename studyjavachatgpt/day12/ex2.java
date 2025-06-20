package studyjavachatgpt.day12;

public class ex2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};

    try {
      System.out.println(arr[5]); //여기서 예외 발생
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열 인덱스 초과!");
    }
  }
}
