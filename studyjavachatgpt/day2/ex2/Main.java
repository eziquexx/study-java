package studyjavachatgpt.day2.ex2;

public class Main {
  public static void main(String[] args) {
    Student stu = new Student("홍길동", 20, 1234567);

    System.out.println(stu.age);
    System.out.println(stu.name);
    System.out.println(stu.studentId);

    stu.introduce();
    stu.printStudentId();
  }
}
