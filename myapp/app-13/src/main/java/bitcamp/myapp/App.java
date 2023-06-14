package bitcamp.myapp;

import bitcamp.myapp.handler.BoardHandler;
import bitcamp.myapp.handler.MemberHandler;
import bitcamp.util.Prompt;

public class App {

  public static void main(String[] args) {

    printTitle();

    printMenu();

    while (true) {
      String menuNo = Prompt.inputString("메인> ");
      if (menuNo.equals("99")) {
        break;
      } else if (menuNo.equals("menu")) {
        printMenu();
      } else if (menuNo.equals("1")) {
        MemberHandler.inputMember();
      } else if (menuNo.equals("2")) {
        MemberHandler.printMembers();
      } else if (menuNo.equals("3")) {
        MemberHandler.viewMember();
      } else if (menuNo.equals("4")) {
        MemberHandler.updateMember();
      } else if (menuNo.equals("5")) {
        MemberHandler.deleteMember();
      } else if (menuNo.equals("6")) {
        BoardHandler.inputBoard();
      } else if (menuNo.equals("7")) {
        BoardHandler.printBoards();
      } else if (menuNo.equals("8")) {
        BoardHandler.viewBoard();
      } else if (menuNo.equals("9")) {
        BoardHandler.updateBoard();
      } else if (menuNo.equals("10")) {
        BoardHandler.deleteBoard();
      } else {
        System.out.println(menuNo);
      }
    }

    Prompt.close();
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
    System.out.println("99. 종료");
  }

  static void printTitle() {
    System.out.println("");
    System.out.println("< 미용실 회원 관리 시스템 >");
    System.out.println("");
  }

  static boolean promptContinue() {
    String response = Prompt.inputString("계속 하시겠습니까?(Y/n) ");
    if (!response.equals("") && !response.equalsIgnoreCase("Y")) {
      return false;
    }
    return true;
  }
}
