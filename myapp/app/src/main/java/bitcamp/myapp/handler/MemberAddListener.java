package bitcamp.myapp.handler;

import java.util.List;
import bitcamp.myapp.vo.Member;
import bitcamp.util.BreadcrumbPrompt;

public class MemberAddListener extends AbstractMemberListener {

  public MemberAddListener(List<Member> list) {
    super(list);
  }

  @Override
  public void service(BreadcrumbPrompt prompt) {
    Member m = new Member();
    m.setName(prompt.inputString("이름? "));
    m.setPhoneNo(prompt.inputString("핸드폰 번호? "));
    m.setPassword(prompt.inputString("암호? "));
    m.setGender(inputGender((char) 0, prompt));
    m.setHistory(inputHistory((char) 0, prompt));

    this.list.add(m);
  }

  @Override
  protected char inputHistory(char history, BreadcrumbPrompt prompt) {
    String label;
    if (history != 0) {
      label = String.format("방문 이력(%s)?\n", toHistoryString(history));
    } else {
      label = "방문 이력?\n";
    }

    System.out.print(label); // 방문 이력 메시지 출력

    while (true) {
      String menuNo1 = prompt.inputString("  1. 있다(재 방문)\n" + "  2. 없다(첫 방문)\n" + "> ");

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
