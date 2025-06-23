package studyjavachatgpt.day15.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("banana");
    fruits.add("apple");
    fruits.add("orange");

    System.out.println(fruits); // Collections.sort() 전
    
    Collections.sort(fruits);

    System.out.println(fruits); // Collections.sort() 후
  }
}