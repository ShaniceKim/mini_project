package bitcamp.myapp;

// 코드 본문에서 사용할 클래스가 어떤 패키지의 클래스인지 지정한다.
import java.util.Scanner; //  클래스를 사용하기 위해 해당 패키지를 import

public class App { // 클래스를 선언, 자바 프로그램의 진입점인 main 메서드가 이 클래스에 포함
  public static void main(String[] args) {
    System.out.println("미용실 회원 관리 시스템");
    System.out.println("----------------------------------");

    // 키보드 스캐너 준비
    Scanner scanner = new Scanner(System.in); // 키보드 입력을 받기 위해 Scanner 객체를 생성

    final int MAX_SIZE = 100; // 최대 크기를 나타내는 상수 MAX_SIZE를 선언하고 100으로 초기화
    int userId = 1; // 사용자 ID를 나타내는 변수 userId를 선언하고 1로 초기화
    int length = 0; // 현재까지 입력된 회원 정보의 개수를 나타내는 변수 length를 선언하고 0으로 초기화

    int[] no = new int[MAX_SIZE]; // 회원 번호를 저장할 배열 no를 선언하고 MAX_SIZE 크기로 생성
    String[] name = new String[MAX_SIZE]; // 회원 이름을 저장할 배열 name을 선언하고 MAX_SIZE 크기로 생성
    String[] email = new String[MAX_SIZE]; // 회원 이메일을 저장할 배열 email을 선언하고 MAX_SIZE 크기로 생성
    String[] password = new String[MAX_SIZE]; // 회원 암호를 저장할 배열 password를 선언하고 MAX_SIZE 크기로 생성
    char[] gender = new char[MAX_SIZE]; // 회원 성별을 저장할 배열 gender를 선언하고 MAX_SIZE 크기로 생성

    // 회원정보 등록
    for (int i = 0; i < MAX_SIZE; i++) { // MAX_SIZE 만큼 반복하는 for 반복문을 시작. 회원 정보를 등록하기 위해 반복문을 사용

      System.out.print("이름? ");
      name[i] = scanner.next(); // 사용자로부터 이름을 입력받아 name 배열의 i번째 요소에 저장

      System.out.print("이메일? ");
      email[i] = scanner.next(); // 사용자로부터 이메일을 입력받아 email 배열의 i번째 요소에 저장

      System.out.print("암호? ");
      password[i] = scanner.next(); // 사용자로부터 암호를 입력받아 password 배열의 i번째 요소에 저장

      loop: while (true) { // 무한 루프를 시작, 성별을 입력받을 때 사용자가 유효한 값을 입력할 때까지 반복
        System.out.println("성별: ");
        System.out.println("  1. 남자");
        System.out.println("  2. 여자");
        System.out.print("> ");
        String menuNo = scanner.next(); // 사용자로부터 성별을 나타내는 번호를 입력받아 menuNo에 저장


        switch (menuNo) { 
          case "1": // // case "1":: menuNo가 "1"인 경우를 처리
            gender[i] = 'M'; // 'M';: gender 배열의 i번째 요소에 'M'을 저장
            break loop; // loop 레이블로 표시된 반복문을 종료
          case "2": // menuNo가 "2"인 경우를 처리
            gender[i] = 'W'; // 'W';: gender 배열의 i번째 요소에 'W'을 저장
            break loop; // // loop 레이블로 표시된 반복문을 종료
          default: // 이외의 경우를 처리
            System.out.println("무효한 번호입니다.");
        }
      }

      no[i] = userId++; // no 배열의 i번째 요소에 userId 값을 저장한 후 userId를 1 증가

      length++; //  변수를 1 증가시킴

      System.out.print("계속 하시겠습니까?(Y/n) ");
      scanner.nextLine(); // 이전에 next()를 실행한 후 남아 있던 줄바꿈 코드를 제거
      String response = scanner.nextLine(); // 사용자로부터 다음 라인의 입력을 받아 response에 저장
      if (!response.equals("") && !response.equalsIgnoreCase("Y")) { // 입력된 값이 공백이 아니고 대소문자를 무시한 상태에서 "Y"가 아닌 경우를 확인
        break; // 반복문을 종료
      }
    }

    System.out.println("---------------------------------------");

    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
    scanner.close();
  }
}
