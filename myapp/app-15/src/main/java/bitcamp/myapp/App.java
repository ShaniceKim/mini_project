package bitcamp.myapp;

import bitcamp.myapp.handler.BoardHandler;
import bitcamp.myapp.handler.MemberHandler;
import bitcamp.util.Prompt;

public class App {

  public static void main(String[] args) {

    // 기본 생성자를 이용해 Prompt 인스턴스를 준비한다.
    // => 기본 생성자는 Scanner를 키보드와 연결한다.
    Prompt prompt = new Prompt();

    MemberHandler memberHandler = new MemberHandler(prompt);
    BoardHandler boardHandler = new BoardHandler(prompt);
    BoardHandler readingHandler = new BoardHandler(prompt);


    printTitle();

    printMenu();

    while (true) {
      String menuNo = prompt.inputString("메인> ");
      if (menuNo.equals("99")) {
        break;
      } else if (menuNo.equals("menu")) {
        printMenu();
      } else if (menuNo.equals("1")) {
        memberHandler.inputMember();
      } else if (menuNo.equals("2")) {
        memberHandler.printMembers();
      } else if (menuNo.equals("3")) {
        memberHandler.viewMember();
      } else if (menuNo.equals("4")) {
        memberHandler.updateMember();
      } else if (menuNo.equals("5")) {
        memberHandler.deleteMember();
      } else if (menuNo.equals("6")) {
        boardHandler.inputBoard();
      } else if (menuNo.equals("7")) {
        boardHandler.printBoards();
      } else if (menuNo.equals("8")) {
        boardHandler.viewBoard();
      } else if (menuNo.equals("9")) {
        boardHandler.updateBoard();
      } else if (menuNo.equals("10")) {
        boardHandler.deleteBoard();
      } else if (menuNo.equals("11")) {
        readingHandler.inputBoard();
      } else if (menuNo.equals("12")) {
        readingHandler.printBoards();
      } else if (menuNo.equals("13")) {
        readingHandler.viewBoard();
      } else if (menuNo.equals("14")) {
        readingHandler.updateBoard();
      } else if (menuNo.equals("15")) {
        readingHandler.deleteBoard();
      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }
    }

    prompt.close();
  }

  static void printMenu() {
    System.out.println("1. 회원 등록");
    System.out.println("2. 회원 목록");
    System.out.println("3. 회원 조회");
    System.out.println("4. 회원 변경");
    System.out.println("5. 회원 삭제");
    System.out.println("6. 후기 등록");
    System.out.println("7. 후기 목록");
    System.out.println("8. 후기 조회");
    System.out.println("9. 후기 변경");
    System.out.println("10. 후기 삭제");
    System.out.println("11. 독서록 등록");
    System.out.println("12. 독서록 목록");
    System.out.println("13. 독서록 조회");
    System.out.println("14. 독서록 변경");
    System.out.println("15. 독서록 삭제");
    System.out.println("99. 종료");
  }

  static void printTitle() {
    System.out.println("");
    System.out.println("< 미용실 회원 관리 시스템 >");
    System.out.println("");
  }
}
