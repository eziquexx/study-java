# ☕ 도서관 도서 관리 시스템
> 16일차까지 배운 Java 기초 문법을 활용하여 만든 도서관 도서 관리 시스템 (CLI 기반)<br>
> chat-gpt의 도움을 많이 받음

---

## 📋 요구사항
1. 도서 등록: 제목, 저자, 출판 연도 입력 후 저장
2. 도서 전체 조회: 저장된 도서 리스트를 출판 연도 기준으로 정렬 후 출력
3. 도서 검색: 제목 또는 저자명으로 부분 검색
4. 도서 삭제: 제목 기준으로 삭제
5. 프로그램 종료: 사용자 종료 명령 시 프로그램 종료
6. 예외 처리: 연도 음수 입력 등 사용자 입력 오류에 대한 처리

---

## 📁 디렉토리 구조
- `domain` : Book
- `exception` : InvalidYearException
- `constants` : Message
- `comprator` : BookAuthorComparator, BookTitleComparator, BookYearComparator
- `service` : LibraryService(interface), LibraryServiceImpl(implements)
- LibraryBookManagerApplication.java

```
📁 library-project/
┣ 📁 src/
┃ ┗ 📁 com/
┃   ┗ 📁 example/
┃     ┗ 📁 library/
┃       ┣ 📁 domain/
┃       ┃ ┗ Book.java
┃       ┣ 📁 constants/
┃       ┃ ┗ Message.java
┃       ┣ 📁 exception/
┃       ┃ ┗ InvalidYearException.java
┃       ┣ 📁 comparator/
┃       ┃ ┣ BookTitleComparator.java
┃       ┃ ┣ BookAuthorComparator.java
┃       ┃ ┗ BookYearComparator.java
┃       ┣ 📁 service/
┃       ┃ ┣ LibraryService.java (interface)
┃       ┃ ┗ LibraryServiceImpl.java (implements)
┃       ┗ LibraryBookManagerApplication.java
┗ 📄 README.md
```

---

## 🛠 사용 기술
- Java 17
- VS Code
- Git & GitHub

---

## 🎯 목적
- 16일차까지 배운 내용을 복습과 실무에서 일하는 것처럼 요구사항, 디렉토리를 세밀하게 나누어 작업하며 경험을 쌓기 위함.

---

## 내용정리
- [Jelee's Tistory 로 이동하기](https://dev-jelee.tistory.com/entry/toy-project-Library-Book-Manager-CLI-Java)
