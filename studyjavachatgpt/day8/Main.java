package studyjavachatgpt.day8;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "홍길동";
    student.age = 21;
    student.studentId = 20231234;

    student.introduce(); // Person 클래스에서 상속받은 메서드
    student.showStudentId(); // Student 클래스의 메서드
  }
}
