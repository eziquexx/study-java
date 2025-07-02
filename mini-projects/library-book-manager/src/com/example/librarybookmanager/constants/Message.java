package com.example.librarybookmanager.constants;

public class Message {
  public static final String TITLE = "=== 📚 도서 관리 시스템 ===";
  public static final String MENU = """
      1. 책 등록
      2. 책 목록 보기
      3. 책 검색
      4. 책 삭제
      5. 종료
      """;;
  
  public static final String ERROR_INVALID_YEAR = "출판 연도는 0 이상이어야 합니다.";
  public static final String ERROR_INPUT = "입력 형식이 올바르지 않습니다.";
  public static final String SUCCESS_ADD = "책이 성공적으로 등록되었습니다.";
  public static final String SUCCESS_DELETE = "책이 삭제되었습니다.";
  public static final String BOOK_NOT_FOUND = "해당 조건의 책을 찾을 수 없습니다.";
  public static final String NO_BOOKS = "등록된 책이 없습니다.";
}
