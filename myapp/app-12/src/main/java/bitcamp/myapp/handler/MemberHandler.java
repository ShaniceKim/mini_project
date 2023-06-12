package bitcamp.myapp.handler;

import bitcamp.util.Prompt;
import bitcamp.myapp.vo.Member;

public class MemberHandler {

  static final int MAX_SIZE = 100;
  static Member[] members = new Member[MAX_SIZE];
  static int userId = 1;
  static int length = 0;

  static final char MALE = 'M';
  static final char FEMALE = 'W';
  
  static final char EXIST = '1';
  static final char NON_EXIST = '2';

  public static void inputMember() {
    if (!available()) {
      System.out.println("더이상 입력할 수 없습니다!");
      return;
    }

    Member m = new Member();
    m.setName(Prompt.inputString("이름? "));
    m.setPhoneNo(Prompt.inputString("핸드폰 번호? "));
    m.setPassword(Prompt.inputString("암호? "));
    m.setGender(inputGender((char) 0));
    m.setHistory(inputHistory((char) 0));
    m.setNo(userId++);

    members[length++] = m;
  }

  public static void printMembers() {
    System.out.println("---------------------------------------");
    System.out.println("이름, 핸드폰 번호, 성별, 방문이력");
    System.out.println("---------------------------------------");
  
    for (int i = 0; i < length; i++) {
      Member m = members[i];
      System.out.printf("%s, %s, %s, %s\n", 
      m.getName(), m.getPhoneNo(), 
      toGenderString(m.getGender()),
      toHistoryString(m.getHistory()));

    }
  }
  
  public static void viewMember() {
    String memberName = Prompt.inputString("이름? ");
    for (int i = 0; i < length; i++) {
      Member m = members[i];
      if (m.getName().equals(memberName)) {
        System.out.printf("이름: %s\n", m.getName());
        System.out.printf("핸드폰 번호: %s\n", m.getPhoneNo());
        System.out.printf("성별: %s\n", toGenderString(m.getGender()));
        System.out.printf("방문이력: %s\n", toHistoryString(m.getHistory()));
        return;
      }
    }
    System.out.println("해당 이름의 회원이 없습니다!");
  }

  public static String toGenderString(char gender) {
    return gender == 'M' ? "남성" : "여성";
  }

  private static String toHistoryString(char history) {
    if (history == EXIST) {
      return "있다(재 방문)";
    } else if (history == NON_EXIST) {
      return "없다(첫 방문)";
    } else {
      return "알 수 없다!";
    }
  }

  public static void updateMember() {
    String memberName = Prompt.inputString("이름? ");
    for (int i = 0; i < length; i++) {
      Member m = members[i];
      if (m.getName().equals(memberName)) {
        System.out.printf("이름(%s)? ", m.getName());
        m.setName(Prompt.inputString(""));
        System.out.printf("핸드폰 번호(%s)? ", m.getPhoneNo());
        m.setPhoneNo(Prompt.inputString(""));
        System.out.printf("새 암호? ");
        m.setPassword(Prompt.inputString(""));
        m.setGender(inputGender(m.getGender()));
        m.setHistory(inputHistory(m.getHistory()));
        return;
      }
    }
    System.out.println("해당 이름의 회원이 없습니다!");
  }

  private static char inputGender(char gender) {
    String label;
    if (gender == 0) {
      label = "성별?\n";
    } else {
      label = String.format("성별(%s)?\n", toGenderString(gender));
    }
    while (true) {
      String menuNo = Prompt.inputString(label + 
        "  1. 남자\n" + 
        "  2. 여자\n" + 
        "> ");

      switch (menuNo) {
        case "1":
          return MALE;
        case "2":
          return FEMALE;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }
  }

  private static char inputHistory(char history) {
    String label;
    if (history == 0) {
      label = "방문 이력?\n";
    } else {
      label = String.format("방문 이력(%s)?\n", toHistoryString(history));
    }
    while (true) {
      String menuNo1 = Prompt.inputString(label + 
        "  1. 있다(재 방문)\n" + 
        "  2. 없다(첫 방문)\n" + 
        "> ");
  
      switch (menuNo1) {
        case "1":
          return EXIST;
        case "2":
          return NON_EXIST;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }
  }

  public static void deleteMember() {
    String memberName = Prompt.inputString("이름? ");
    int deletedIndex = -1;
    for (int i = 0; i < length; i++) {
      if (members[i].getName().equals(memberName)) {
        deletedIndex = i;
        break;
      }
    }
    if (deletedIndex != -1) {
      for (int i = deletedIndex; i < length - 1; i++) {
        members[i] = members[i + 1];
      }
      length--;
      System.out.println("회원을 삭제하였습니다.");
    } else {
      System.out.println("해당 이름의 회원이 없습니다!");
    }
  }

  private static boolean available() {
    return length < MAX_SIZE;
  }
}
