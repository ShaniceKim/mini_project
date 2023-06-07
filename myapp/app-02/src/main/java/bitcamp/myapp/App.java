package bitcamp.myapp; //bitcamp.myapp 패키지에 속하는 클래스를 정의

public class App { // App이라는 이름의 public 클래스를 선언
  public static void main(String[] args) { // main이라는 이름의 public static method 선언
                                          // 프로그램의 시작점의 역할. String 배열 타입의 args 매개변수를 받음
    System.out.println("미용실 회원 관리 시스템"); // 출력
    System.out.println("----------------------------------"); // 구분선 출력
    
    System.out.print("번호: "); // 번호 출력
    System.out.println(100); // 숫자 100 출력

    System.out.printf("이름: %s", "김세연"); // 이름: 다음에 문자열을 형식에 맞추어 출력
    System.out.println(); 

    System.out.println("나이: " + 25); // 나이: 다음 숫자 20을 문자열로 변환하여 출력 

    System.out.printf("재 방문: %b\n", true); // 재 방문: 다음에 true 값을 형식에 맞추어 출력, %b 는 논리값을 출력하기 위한 형식 지정자

    System.out.printf("성별(남자(M), 여자(W)): %c\n", 'M'); // 성별 다음 M을 형식에 맞추어 출력, %c 는 문자를 출력하기 위한 형식 지정자

  
  }

}