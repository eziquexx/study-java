package day11.ex3;

public class Main {
  public static void main(String[] args) {
    // Vehicle[] vehicle = {new Car(), new Bike()};
    // vehicle[0].startEngine();
    // vehicle[1].startEngine();

    Vehicle car = new Car();
    Vehicle bike = new Bike();
    car.startEngine();
    bike.startEngine();
  }
}
