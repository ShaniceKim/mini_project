package bitcamp.myapp.vo;

public class Member {

  private static int userId = 1;

  // 상수는 스태틱 필드로 정의한다.
  // GRASP 패턴 : Information Expert
  // => 정보를 다룰때는 그 정보를 갖고 있는 클래스에 둔다.
  // => 필드도 마찬가지이다.

  public static final char MALE = 'M';
  public static final char FEMALE = 'W';

  // 인스턴스 필드는 각각 개별적으로 유지해야 하는 값을 저장할 때 사용한다.
  // new 명령을 통해 변수를 Heap 영역에 저장한다.
  
  private int no;
  private String name;
  private String phoneNo;
  private String password;
  private char gender;
  private char history;

  // 생성자는 인스턴스를 생성한 후 필드를 초기화 시키는 일을 한다.
  // 인스턴스를 사용할 때 문제가 없도록 유효한 값으로 초기화 시킨다.
  // 기본 생성자 (default constructor) 는 개발자가 생성자를 정의하지 않을 때 컴파일러가 추가해준다.
  // 물론 개발자가 직접 추가할 수도 있다.

  public Member() {
    this.no = userId++;
  }

  // getter,setter 는 인스턴스 필드의 값을 설정하고 꺼내는 메서드이다.
  // 보통 외부에서 직접 필드에 접근하는 것을 막았을 때 사용한다.

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }
  
  public char getHistory() {
    return history;
  }
  

  public void setHistory(char history) {
    this.history = history;
  }
}
