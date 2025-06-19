package studyjavachatgpt.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Book2> books = new ArrayList<>();

    // while문 + switch문 사용하여 메뉴 출력
    while (true) {
      
      // try-catch문 사용해서 숫자 외 문자 입력 시 예외처리 해주기.
      try {
        System.out.println("1. 책 추가\n" + "2. 책 목록 출력\n" + "3. 책 검색\n" + "4. 종료");
        System.out.print("메뉴 선택: ");
        int menuNum = Integer.parseInt(br.readLine()); // 메뉴번호 입력 받기

        switch (menuNum) {
          case 1: // 메뉴 1 - 책 추가
            System.out.print("책 제목 입력: ");
            String title = br.readLine();
            System.out.print("저자 입력: ");
            String author = br.readLine();

            books.add(new Book2(title, author)); // 입력 받은 title, author값을 books 객체에 추가.
            System.out.println("책이 추가되었습니다!");    
            break;

          case 2: // 메뉴 2 - 책 목록 출력
            for (Book2 book : books) {
              book.printInfo();
            }
            System.out.println(books.size());
            break;

          case 3: // 메뉴 3 - 책 검색
            String input = br.readLine(); // 검색 받기
            boolean found = false; 
            
            for (Book2 book : books) {
              if (book.getTitle().contains(input) || book.getAuthor().contains(input)) {
                book.printInfo();

                found = true;
              }
            }

            if (found != true) {
              System.out.println("해당 단어가 포함된 책이 없습니다.");
            }

            break;

          case 4: // 메뉴 4 - 프로그램 종료
            System.out.println("프로그램을 종료합니다.");
            return;

          default:
            System.out.println("1~4번 중 메뉴를 선택해주세요.");
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
      }

      br.close();
    }
  }
}
