# ☕ 도서 관리 시스템
> 16일차까지 배운 Java 기초 문법을 활용하여 만든 도서관 도서 관리 시스템 (CLI 기반)<br>
> chat-gpt의 도움을 많이 받음
```
- 개발 기간: 25.07.02 ~ 25.07.03
- 목적: 16일차까지 배운 내용을 복습과 실무에서 일하는 것처럼 요구사항, 디렉토리를 세밀하게 나누어 작업하며 경험을 쌓기 위함.
```
---

## 🧩 구현 기능
<table>
  <thead>
    <tr>
      <th>기능</th>
      <th>설명</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>도서 등록</td>
      <td>제목, 저자, 출판 연도 입력 후 저장</td>
    </tr>
    <tr>
      <td>도서 전체 조회</td>
      <td>저장된 도서 리스트를 출판 연도 기준으로 정렬 후 출력</td>
    </tr>
    <tr>
      <td>도서 검색</td>
      <td>제목 또는 저자명으로 부분 검색</td>
    </tr>
    <tr>
      <td>도서 삭제</td>
      <td>제목 기준으로 삭제</td>
    </tr>
    <tr>
      <td>프로그램 종료</td>
      <td>사용자 종료 명령 시 프로그램 종료</td>
    </tr>
    <tr>
      <td>예외 처리</td>
      <td>연도 음수 입력 등 사용자 입력 오류에 대한 처리</td>
    </tr>
  </tbody>
</table>

---

## 🛠 사용 기술 스택
- Java 17
- VS Code
- Git & GitHub

---

## 🎬 데모 보기
👉 [데모 영상 보러가기](https://youtu.be/IlUydW20KMI) - CLI로 도서 등록/검색/조회/삭제 데모 영상

---

## 📘 프로젝트 상세 기록 (블로그)
👉 [포스팅 보러가기](https://dev-jelee.tistory.com/entry/toy-project-Library-Book-Manager-CLI-Java) - 티스토리에 올린 포스트

---

## 📁 디렉토리 구조

```
📂 src/com/example/librarybookmanager
├── LibraryBookManagerApplication.java   // 프로그램 실행 진입점
├── domain/
│   └── Book.java                        // 도서 정보 클래스
├── service/
│   ├── LibraryService.java              // 서비스 인터페이스
│   └── LibraryServiceImpl.java          // 비즈니스 로직 구현체
├── constants/
│   └── Messages.java                    // 메시지 상수 모음
├── exception/
│   └── InvalidYearException.java        // 사용자 정의 예외
├── comparator/
│   ├── BookTitleComparator.java         // 제목 정렬
│   ├── BookAuthorComparator.java        // 저자 정렬
│   └── BookYearComparator.java          // 연도 정렬
└── README.md
```

---

