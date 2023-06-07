package bitcamp.myapp; //bitcamp.myapp 패키지에 속하는 클래스를 정의

public class App { // App이라는 이름의 public 클래스를 선언
  public static void main(String[] args) { // main이라는 이름의 public static method 선언
    // 프로그램의 시작점의 역할. String 배열 타입의 args 매개변수를 받음
    System.out.println("미용실 회원 관리 시스템");
    System.out.println("----------------------------------");

    int no = 100; // no 라는 이름의 정수형 변수를 선언하고 100으로 초기화 함
    String name = "김세연"; // name 이라는 이름의 문자열 변수를 선언하고 그 변수에 이름 값 할당
    int age = 25; // age 라는 이름의 정수형 변수를 선언하고 20으로 초기화
    boolean history = true; // history 이라는 이름의 논리형 변수를 선언하고 true로 초기화
    char gender = 'W'; // gender라는 이름의 문자형 변수를 선언하고 'W'으로 초기화

    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    System.out.printf("재방문: %b\n", history);
    System.out.printf("성별(남자(M), 여자(W)): %c\n", gender);
  }
}
