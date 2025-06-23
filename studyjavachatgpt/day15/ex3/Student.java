package studyjavachatgpt.day15.ex3;

public class Student {
  String name;
  int score;

  Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public String toString() {
    return name + " (" + score + "점)";
  }
}
