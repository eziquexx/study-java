package studyjavachatgpt.day2.ex1;

public class Car {
  String brand;
  int year;

  Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

  void info() {
    System.out.println(year + "년식 " + brand + " 자동차입니다.");
  }
}