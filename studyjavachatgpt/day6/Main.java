package studyjavachatgpt.day6;

public class Main {
  public static void main(String[] args) {
    User u1 = new User("홍길동");
    User.printUserCount(); // static 메서드 호출
    User u2 = new User("김철수");

    System.out.println("사용자 1: " + u1.getName());
    System.out.println("사용자 2: " + u2.getName());

    User.printUserCount(); // static 메서드 호출
  }
}
