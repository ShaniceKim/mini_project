package bitcamp.myapp.handler;

import bitcamp.util.Prompt;

public class MemberHandler {

  static final int MAX_SIZE = 100;
  static int[] no = new int[MAX_SIZE];
  static String[] name = new String[MAX_SIZE];
  static String[] email = new String[MAX_SIZE];
  static String[] password = new String[MAX_SIZE];
  static char[] gender = new char[MAX_SIZE];
  static int userId = 1;
  static int length = 0;

  static final char MALE = 'M';
  static final char FEMALE = 'W';

  public static void inputMember() {
    if (!available()) {
      System.out.println("더이상 입력할 수 없습니다!");
      return;
    }

    name[length] = Prompt.inputString("이름? ");
    email[length] = Prompt.inputString("이메일? ");
    password[length] = Prompt.inputString("암호? ");
    gender[length] = inputGender((char)0);

    no[length] = userId++;
    length++;
  }

  public static void printMembers() {
    System.out.println("---------------------------------------");
    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %s\n", 
        no[i], name[i], email[i], 
        toGenderString(gender[i]));
    }
  }

  public static void viewMember() {
    String memberNo = Prompt.inputString("번호? ");
    for (int i = 0; i < length; i++) {
      if (no[i] == Integer.parseInt(memberNo)) {
        System.out.printf("이름: %s\n", name[i]);
        System.out.printf("이메일: %s\n", email[i]);
        System.out.printf("성별: %s\n", toGenderString(gender[i]));
        return;
      }
    }
    System.out.println("해당 번호의 회원이 없습니다!");
  }

  public static String toGenderString(char gender) {
    return gender == 'M' ? "남성" : "여성";
  }

  public static void updateMember() {
    String memberNo = Prompt.inputString("번호? ");
    for (int i = 0; i < length; i++) {
      if (no[i] == Integer.parseInt(memberNo)) {
        System.out.printf("이름(%s)? ", name[i]);
        name[i] = Prompt.inputString("");
        System.out.printf("이메일(%s)? ", email[i]);
        email[i] = Prompt.inputString("");
        System.out.printf("새암호? ");
        password[i] = Prompt.inputString("");
        gender[i] = inputGender(gender[i]);
        return;
      }
    }
    System.out.println("해당 번호의 회원이 없습니다!");
  }

  private static char inputGender(char gender) {
    String label;
    if (gender == 0) {
      label = "성별?\n";
    } else {
      label = String.format("성별(%s)?\n", toGenderString(gender));
    }
    loop: while (true) {
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

  public static void deleteMember() {
    int memberNo = Prompt.inputInt("번호? ");
    int deletedIndex = indexOf(memberNo);

    // 삭제하려는 회원의 정보가 들어있는 인덱스를 알아낸다.
    for (int i = 0; i < length; i++) {
        if (no[i] == Integer.parseInt(memberNo)) {
            deletedIndex = i;
            break;
        }
    }

    if (deletedIndex == -1) { // // 회원 정보가 없는 경우 오류 메시지를 출력한다.
        System.out.println("해당 번호의 회원이 없습니다!");
        return;
    }

    if (deletedIndex == length - 1) {
          // 삭제하려는 항목이 맨 끝 항목이라면 마지막 항목의 값만 0으로 초기화 시킴
        no[deletedIndex] = 0;
        name[deletedIndex] = null;
        email[deletedIndex] = null;
        password[deletedIndex] = null;
        gender[deletedIndex] = (char)0;
    } else { // 그 밖에는 해당 인덱스부터 반복하면서 앞 인덱스의 값을 당겨옴
        for (int i = deletedIndex; i < length - 1; i++) {
            no[i] = no[i + 1];
            name[i] = name[i + 1];
            email[i] = email[i + 1];
            password[i] = password[i + 1];
            gender[i] = gender[i + 1];
        }
      }

    // 마지막 인덱스의 값을 0으로 초기화
    no[length - 1] = 0;
    name[length - 1] = null;
    email[length - 1] = null;
    password[length - 1] = null;
    gender[length - 1] = (char)0;

    // length를 하나 줄인다
    length--;
  }

  private static int indexOf(int no){

  }



  private static boolean available() {
    return length < MAX_SIZE;
  }
}