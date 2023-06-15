package bitcamp.myapp.handler;

import bitcamp.myapp.vo.Member;
import bitcamp.util.Prompt;

// MemberHandler는 Handler 규칙에 따라 메서드를 구현했다.
// 즉 Handler 인터페이스에 선언된 메서드를 모두 정의했다.

public class MemberHandler implements Handler {

  private MemberList list = new MemberList();
  private Prompt prompt;
  private String title;

  // 생성자 : 인스턴스를 사용할 수 있도록 유효한 값으로 초기화 시키는 일을 한다.
  // => 필요한 값을 외부에서 받고 싶으면 파라미터를 선언하라.
  public MemberHandler(Prompt prompt, String title) {
    this.prompt = prompt;
    this.title = title;
  }

  // Handler 인터페이스에 선언된 대로 메서드를 정의했다.
  // => "Handler 인터페이스를 구현했다."라고 표현한다.
  @Override // 인터페이스에 선언된 메서드를 정의했다.
  // 슈퍼클래스의 메서드를 재정의 했다. => 오버라이드
  public void execute() {
    // Handler 인터페이스에 선언된 대로 메서드를 정의했다.
    // => Handler "인터페이스를 구현했다" 라고 표현한다.
    printMenu();

    while (true) {
      String menuNo = prompt.inputString("%s> ", this.title);
      if (menuNo.equals("0")) {
        return;
      } else if (menuNo.equals("menu")) {
        printMenu();
      } else if (menuNo.equals("1")) { 
        this.inputMember();
      } else if (menuNo.equals("2")) {
        this.printMembers();
      } else if (menuNo.equals("3")) {
        this.viewMember();
      } else if (menuNo.equals("4")) {
        this.updateMember();
      } else if (menuNo.equals("5")) {
        this.deleteMember();
      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }
    }
  }

  private static void printMenu() {
    System.out.println("1. 회원 등록");
    System.out.println("2. 회원 목록");
    System.out.println("3. 회원 조회");
    System.out.println("4. 회원 변경");
    System.out.println("5. 회원 삭제");
    System.out.println("0. 메인");
  }

  private void inputMember() {
    Member m = new Member(); // 입력값 먼저 받아준다.
    m.setName(this.prompt.inputString("이름? "));
    m.setPhoneNo(this.prompt.inputString("핸드폰 번호? "));
    m.setPassword(this.prompt.inputString("암호? "));
    m.setGender(inputGender((char)0));

    if (!this.list.add(m)) { // add 하지 못했다면
      System.out.println("입력 실패입니다!"); // 입력이 실패했다고 출력해줌
    }
  }

  private void printMembers() {
    System.out.println("---------------------------------------");
    System.out.println("번호, 이름, 핸드폰 번호, 성별, 방문이력");
    System.out.println("---------------------------------------");

    Member[] arr = this.list.list(); // member 리스트에서 list 호출
    for (Member m : arr) { // 여기서 for 문의 반복은 배열의 첫번째부터 끝까지 계속 반복
      System.out.printf("%s, %s, %s, %s\n", 
      m.getName(), m.getPhoneNo(), 
      toGenderString(m.getGender()),
      toHistoryString(m.getHistory()));

    }
  }

  private void viewMember() {
    int memberNo = this.prompt.inputInt("번호? ");

    Member m = this.list.get(memberNo); // int 값 받아줌
    if (m == null) { // 리턴된 멤버값이 null이면 
      System.out.println("해당 번호의 회원이 없습니다!"); // 문구 출력해줌
      return;
    }

    System.out.printf("이름: %s\n", m.getName());
    System.out.printf("핸드폰 번호: %s\n", m.getPhoneNo());
    System.out.printf("성별: %s\n", toGenderString(m.getGender()));
    System.out.printf("방문 이력: %s\n", toHistoryString(m.getHistory()));
  }

  private static String toGenderString(char gender) {
    return gender == 'M' ? "남성" : "여성";
  }

  private static String toHistoryString(char history) {
    if(history == Member.EXIST) {
      return "있다(재 방문)";
    } else if (history == Member.NON_EXIST) {
      return "없다(첫 방문)";
    } else {
      return "알 수 없다!";
    }
  }

  private void updateMember() {
    int memberNo = this.prompt.inputInt("번호? ");

    Member m = this.list.get(memberNo);
    if (m == null) {
      System.out.println("해당 번호의 회원이 없습니다!");
      return;
    }

    m.setName(this.prompt.inputString("이름(%s)? ", m.getName()));
    m.setPhoneNo(this.prompt.inputString("핸드폰 번호(%s)? ", m.getPhoneNo()));
    m.setPassword(this.prompt.inputString("새암호? "));
    m.setGender(inputGender(m.getGender()));
  }

  private char inputGender(char gender) {
    String label;
    if (gender == 0) {
      label = "성별?\n";
    } else {
      label = String.format("성별(%s)?\n", toGenderString(gender));
    }

    while (true) {
      String menuNo = this.prompt.inputString(label +
          "  1. 남자\n" +
          "  2. 여자\n" +
          "> ");

      switch (menuNo) {
        case "1":
          return Member.MALE;
        case "2":
          return Member.FEMALE;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }
  }

  private char inputHistory(char history) {
    String label;
    if (history == 0) {
      label = "방문 이력?\n";
    } else {
      label = String.format("방문 이력(%s)?\n", toHistoryString(history));
    }
    while (true) {
      String menuNo1 = this.prompt.inputString(label + 
        "  1. 있다(재 방문)\n" + 
        "  2. 없다(첫 방문)\n" + 
        "> ");
  
      switch (menuNo1) {
        case "1":
          return Member.EXIST;
        case "2":
          return Member.NON_EXIST;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }
  }

  private void deleteMember() { // 사용자로부터 입력받은 값을 삭제시키려고 했는데
    // 만약에 삭제를 못했다면 (== delete 이 true 가 아닐때) 
    if (!this.list.delete(this.prompt.inputInt("번호? "))) {
      System.out.println("해당 번호의 회원이 없습니다!"); // 회원 없다고 문장 출력됨
    }
  }
}