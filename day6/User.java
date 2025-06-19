package day6;

public class User {
  private String name;
  static int userCount = 0;

  public User(String name) {
    this.name = name;
    userCount++; // 인스턴스 만들 때마다 userCount++ 됨
  }

  public String getName() {
    return name;
  }

  public static void printUserCount() {
    System.out.println("총 사용자 수: " + userCount);
  }
}