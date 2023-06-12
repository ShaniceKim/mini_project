package bitcamp.myapp.vo;

public class Member {

  private static int userId = 1;

  public static final char MALE = 'M';
  public static final char FEMALE = 'W';

  private int no;
  private String name;
  private String phoneNo;
  private String password;
  private char gender;
  private char history;

  public Member() {
    this.no = userId++;
  }

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
