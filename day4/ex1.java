package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Book> books= new ArrayList<>();

    while (true) {
      System.out.println("1. 책 추가\n" + "2. 책 목록 출력\n" + "3. 책 검색\n" + "4. 종료");
      int choice = Integer.parseInt(br.readLine());
      
      switch (choice) {
        case 1 :
          System.out.println("책 제목 입력: ");
          String bookName = br.readLine();
          System.out.println("저자 입력: ");
          String author = br.readLine();
          books.add(new Book(bookName, author));
          System.out.println("책 제목: " + bookName + ", 저자: " + author + "\n책이 추가되었습니다!");
          break;
        case 2 :
          for (Book book : books) {
            System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
          }
          break;
        case 3 :
          System.out.println("검색할 제목: ");
          String search = br.readLine();
          for (Book book : books) {
            if (book.getTitle().equals(search) || book.getAuthor().equals(search)) {
              System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
            }
          }
          break;
        case 4 :
          return;
      }
    }
  }
}
