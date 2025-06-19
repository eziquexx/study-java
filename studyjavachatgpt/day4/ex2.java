package studyjavachatgpt.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Book> books= new ArrayList<>();

    while (true) {
      System.out.println("1. 책 추가\n" + "2. 책 목록 출력\n" + "3. 책 검색\n" + "4. 종료");
      System.out.print("메뉴 선택: ");

      try {
        int choice = Integer.parseInt(br.readLine());
      
        switch (choice) {
          case 1 :
            System.out.print("책 제목 입력: ");
            String bookName = br.readLine();
            System.out.print("저자 입력: ");
            String author = br.readLine();
            books.add(new Book(bookName, author));
            System.out.println("책 제목: " + bookName + ", 저자: " + author + " 책이 추가되었습니다!");
            break;

          case 2 :
            for (Book book : books) {
              System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
            }
            break;

          case 3 :
            System.out.println("검색할 제목: ");
            Boolean found = false;
            String search = br.readLine();
            for (Book book : books) {
              if (book.getTitle().equals(search) || book.getAuthor().equals(search)) {
                System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
                found = true;
              }

            }
            if (!found) {
              System.out.println("검색 결과가 없습니다.");
            }
            break;

          case 4 :
            return;

          default :
            System.out.println("1~4 사이의 숫자를 입력해주세요.");
        }

      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요.");
      }
      
    }
  }
}
