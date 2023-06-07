// App 클래스와 여러개의 정적 메서드 포함
// 이 메서드들은 main 메서드에서 호출되어 실행
// 각 메서드의 역할


package bitcamp.myapp; // 패키지에 속하는 클래스를 선언

import java.util.Scanner; // java.util 패키지에서 Scanner 클래스를 가져옴, 
                          // Scanner는 사용자로부터 입력을 받기 위해 사용

public class App { // App 클래스를 선언하고, main 메서드를 정의
                  //main 메서드는 프로그램의 진입점(entry point)으로서 실행이 시작되는 곳
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    // Scanner 객체를 생성하고 표준 입력(System.in)을 사용하여 사용자의 입력을 받을 수 있도록 함

    final int MAX_SIZE = 100; // MAX_SIZE라는 상수를 선언하고 100으로 초기화
    int userId = 1; // userId 변수를 선언하고 1로 초기화, 이 변수는 회원에게 고유한 식별자로 사용
    int length = 0; // length 변수를 선언하고 0으로 초기화, 이 변수는 현재까지 입력된 회원의 수를 저장

    // no, name, email, address, gender라는 배열을 선언
    // 각 배열의 크기는 MAX_SIZE로 지정 
    // 이 배열들은 회원의 정보를 저장하기 위해 사용
    int[] no = new int[MAX_SIZE];
    String[] name = new String[MAX_SIZE];
    String[] email = new String[MAX_SIZE];
    String[] address = new String[MAX_SIZE];
    char[] gender = new char[MAX_SIZE];

    printTitle(); // printTitle() 메서드를 호출하여 프로그램의 제목과 구분선을 출력

    for (int i = 0; i < MAX_SIZE; i++) { // for 루프를 사용하여 MAX_SIZE만큼 회원 정보를 입력받음
      inputMember(scanner, i, name, email, password, gender, no, userId++);
      // inputMember 메서드를 호출하여 회원 정보를 입력받음. 입력된 정보는 배열에 저장
      length++; // length 변수를 증가시켜 입력된 회원 수를 추적
      if (!promptContinue(scanner)) {
        // promptContinue 메서드를 호출하여 계속 입력을 받을지 여부를 확인
        // 사용자가 Y 또는 y를 입력하면 계속 입력받음
        break; // 그렇지 않으면 루프를 종료
      }
    }

    printMembers(length, no, name, email, gender); // printMembers 메서드를 호출하여 입력된 회원 정보를 출력
    // length, no, name, email, gender 배열이 인자로 전달됨
    scanner.close(); // Scanner 객체를 닫아 사용이 끝났음을 표시
  }

  static void printTitle() { // printTitle 정적 메서드를 정의. 이 메서드는 프로그램의 제목과 구분선을 출력
    System.out.println("미용실 회원 관리 시스템");
    System.out.println("----------------------------------");
  }

  static void inputMember(Scanner scanner, int i,
      String[] name, String[] email, String[] address, char[] gender, int[] no, int userId) {
        // inputMember 정적 메서드를 정의
    System.out.print("이름? "); // 사용자에게 이름을 입력하라는 메시지를 출력하고
    name[i] = scanner.next(); // 사용자의 입력을 name 배열의 해당 인덱스에 저장

    System.out.print("이메일? "); // 사용자에게 이메일을 입력하라는 메시지를 출력하고
    email[i] = scanner.next(); // 사용자의 입력을 email 배열의 해당 인덱스에 저장

    System.out.print("주소? "); // 사용자에게 암호를 입력하라는 메시지를 출력하고
    password[i] = scanner.next(); // 사용자의 입력을 password 배열의 해당 인덱스에 저장

    loop: while (true) { // loop라는 레이블이 지정된 무한 루프를 시작
      System.out.println("성별: "); // 성별을 입력하라는 메시지와 선택 옵션을 출력
      System.out.println("  1. 남자"); 
      System.out.println("  2. 여자");
      System.out.print("> ");
      String menuNo = scanner.next(); // 사용자로부터 입력을 받고, menuNo 변수에 저장
      scanner.nextLine(); // 입력 값(token)을 읽고 난 후에 남아 있는 줄바꿈 코드를 제거

      switch (menuNo) { // menuNo 변수의 값에 따라 분기하여 성별을 설정
        case "1": //  만약 menuNo가 "1"일 경우
          gender[i] = 'M'; // gender[i] = 'M'; - gender 배열의 i번째 요소를 'M'으로 설정
          break loop; // loop 레이블로 표시된 반복문을 종료
        case "2": // 만약 menuNo가 "2"일 경우
          gender[i] = 'W'; // 'W'; - gender 배열의 i번째 요소를 'W'로 설정
          break loop; //  - loop 레이블로 표시된 반복문을 종료
        default: // 위의 case 문에 해당하지 않는 경우
          System.out.println("무효한 번호입니다."); //  - "무효한 번호입니다."라는 메시지를 출력
      }
    }

    no[i] = userId; // no 배열의 i번째 요소에 userId 값을 저장. userId는 회원 번호로 사용
  }

  static boolean promptContinue(Scanner scanner) { 
    // promptContinue는 사용자에게 프로그램을 계속 진행할 것인지를 묻고
    // 사용자의 응답에 따라 true 또는 false를 반환하는 정적 메서드
    System.out.print("계속 하시겠습니까?(Y/n) "); // System.out.print("계속 하시겠습니까?(Y/n) ");
    // 사용자에게 질문을 출력
    String response = scanner.nextLine(); // String response = scanner.nextLine();: 사용자의 입력을 받아 response 변수에 저장
    // nextLine() 메서드를 호출하여 한 줄의 입력
    if (!response.equals("") && !response.equalsIgnoreCase("Y")) {
      return false;
    }
    return true;
  }

  static void printMembers(int length, int[] no, String[] name, String[] email, char[] gender) {
    System.out.println("---------------------------------------");
    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
  }
}
