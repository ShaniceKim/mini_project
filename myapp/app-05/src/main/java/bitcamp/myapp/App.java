package bitcamp.myapp;

// 목록 관리 시스템의 정보를 배열에 저장하고 출력하는 Java program
// 목록의 크기는 SIZE 변수로 설정되어 있으며
// 사용자로부터 입력받은 정보는 배열에 순차적으로 저장
import java.util.Scanner; // java.util패키지에서 Scanner 클래스를 가져옴, 클래스는 사용자의 입력을 읽기 위해 사용 

public class App {
  public static void main(String[] args) {
    System.out.println("미용실 회원 관리 시스템");
    System.out.println("----------------------------------");

    // 키보드 스캐너 준비
    Scanner scanner = new Scanner(System.in); // 사용자의 입력을 받기위해 Scanner 객체 사용
                                              // System.in 은 표준 입력을 의미(키보드 입력)

    final int SIZE = 100; // 배열의 크기를 나타내는 상수 SIZE 선언 후 100으로 초기화

    int[] no = new int[SIZE]; // no 라는 이름의 정수형 배열을 선언하고 크기를 SIZE 로 지정
    String[] name = new String[SIZE]; // name 이라는 이름의 문자열 배열을 선언하고 크기를 SIZE로 지정, 이 배열은 이름을 저장
    int[] age = new int[SIZE]; // age라는 이름의 정수형 배열을 선언하고 크기를 SIZE로 지정, 이 배열은 나이를 저장
    boolean[] history = new boolean[SIZE]; // history라는 이름의 논리형 배열을 선언하고 크기를 SIZE로 지정, 이 배열은 방문 이력을 저장
    char[] gender = new char[SIZE]; // gender라는 이름의 문자형 배열을 선언하고 크기를 SIZE로 지정, 이 배열은 성별을 저장
    

    for (int i = 0; i < SIZE; i++) { // 부터 SIZE-1까지의 범위에서 반복문을 실행
      // 사용자로부터 번호, 이름, 나이, 방문 이력, 성별, 좌우 시력을 입력받아 배열에 저장
      System.out.print("번호? ");
      no[i] = scanner.nextInt(); // 사용자로부터 정수 값을 입력받아 no 배열의 i번째 요소에 저장

      System.out.print("이름? ");
      name[i] = scanner.next(); // 사용자로부터 문자열을 입력받아 name 배열의 i번째 요소에 저장

      System.out.print("나이? ");
      age[i] = scanner.nextInt(); // 사용자로부터 정수 값을 입력받아 age 배열의 i번째 요소에 저장

      System.out.print("재 방문(true/false)? ");
      history[i] = scanner.nextBoolean(); // 사용자로부터 논리 값을 입력받아 history 배열의 i번째 요소에 저장

      System.out.print("성별(남자:M, 여자:W)? ");
      String str = scanner.next(); // 사용자로부터 문자열을 입력받아 str에 저장
      gender[i] = str.charAt(0); // str 문자열의 첫 번째 문자를 가져와 gender 배열의 i번째 요소에 저장
    }

    System.out.println("---------------------------------------");

    for (int i = 0; i < SIZE; i++) {
      System.out.printf("번호: %d\n", no[i]);
      System.out.printf("이름: %s\n", name[i]);
      System.out.printf("나이: %d\n", age[i]);
      System.out.printf("재 방문: %b\n", history[i]);
      System.out.printf("성별(남자(M), 여자(W)): %c\n", gender[i]);
    }
    scanner.close();
  }
}
