package bitcamp.myapp;

// 코드 본문에서 사용할 클래스가 어떤 패키지의 클래스인지 지정한다.
import java.util.Scanner; // java.util 패키지에서 Scanner 클래스를 가져옴  
                          // Scanner 클래스는 사용자의 입력을 읽기 위해 사용

public class App {
  public static void main(String[] args) {
    System.out.println("미용실 회원 관리 시스템");
    System.out.println("----------------------------------");

    // 키보드 스캐너 준비
    Scanner scanner = new Scanner(System.in); // 사용자의 입력을 받기 위해 Scanner 객체를 생성
                                              // System.in은 표준 입력(키보드 입력)을 의미

    System.out.print("번호? ");
    int no = scanner.nextInt(); // 사용자로부터 정수형 데이터를 입력받아 no 변수에 저장
                                // nextInt() 메서드는 정수를 입력받기 위해 사용

    System.out.print("이름? "); 
    String name = scanner.next(); // 사용자로부터 문자열 데이터를 입력받아 name 변수에 저장 
                                  // next() 메서드는 공백을 제외한 문자열을 입력

    System.out.print("나이? "); 
    int age = scanner.nextInt(); // 사용자로부터 정수형 데이터를 입력받아 age 변수에 저장

    System.out.print("재방문? (true/false)? ");
    boolean history = scanner.nextBoolean(); // 사용자로부터 논리형 데이터를 입력받아 working 변수에 저장
                                            // nextBoolean() 메서드는 true 또는 false 값을 입력
    System.out.print("성별(남자:M, 여자:W)? ");
    String str = scanner.next(); // 사용자로부터 문자열 데이터를 입력받아 str 변수에 저장
    char gender = str.charAt(0); // 문자열 str의 첫 번째 문자를 추출하여 gender 변수에 저장

    System.out.println("---------------------------------------");

    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    System.out.printf("재방문: %b\n", history);
    System.out.printf("성별(남자(M), 여자(W)): %c\n", gender);

    scanner.close();
  }
}
