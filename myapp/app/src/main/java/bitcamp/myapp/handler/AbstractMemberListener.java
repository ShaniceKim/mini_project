package bitcamp.myapp.handler;

import java.util.List;
import bitcamp.myapp.vo.Member;
import bitcamp.util.ActionListener;
import bitcamp.util.BreadcrumbPrompt;

public abstract class AbstractMemberListener implements ActionListener {

  protected List<Member> list;

  public AbstractMemberListener(List<Member> list) {
    this.list = list;
  }

  protected static String toGenderString(char gender) {
    return gender == 'M' ? "남성" : "여성";
  }

  protected static String toHistoryString(char history) {
    if (history == Member.EXIST) {
      return "있다(재 방문)";
    } else if (history == Member.NON_EXIST) {
      return "없다(첫 방문)";
    } else {
      return "알 수 없다!";
    }
  }

  protected Member findBy(int no) {
    for (int i = 0; i < this.list.size(); i++) {
      Member m = this.list.get(i);
      if (m.getNo() == no) {
        return m;
      }
    }
    return null;
  }

  protected char inputGender(char gender, BreadcrumbPrompt prompt) {
    String label;
    if (gender == 0) {
      label = "성별?\n";
    } else {
      label = String.format("성별(%s)?\n", toGenderString(gender));
    }

    while (true) {
      String menuNo = prompt.inputString(label + "  1. 남자\n" + "  2. 여자\n" + "> ");

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

  protected char inputHistory(char history, BreadcrumbPrompt prompt) {
    String label;
    if (history != 0) {
      label = String.format("방문 이력(%s)?\n", toHistoryString(history));
    } else {
      label = "방문 이력?\n";
    }

    while (true) {
      String menuNo1 = prompt.inputString(label + "  1. 있다(재 방문)\n" + "  2. 없다(첫 방문)\n" + "> ");

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


}
