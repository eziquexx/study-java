package studyjavachatgpt.day11.ex3;

abstract class Vehicle {
  abstract void startEngine();
  
  void stopEngine() {
    System.out.println("엔진 정지");
  }
}
