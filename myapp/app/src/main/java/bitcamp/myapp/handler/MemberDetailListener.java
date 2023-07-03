package bitcamp.myapp.handler;

import java.util.List;
import bitcamp.myapp.vo.Member;
import bitcamp.util.BreadcrumbPrompt;

public class MemberDetailListener extends AbstractMemberListener {

  public MemberDetailListener(List<Member> list) {
    super(list);
  }

  @Override
  public void service(BreadcrumbPrompt prompt) {
    String memberName = prompt.inputString("이름? ");

    Member m = this.findByName(memberName);
    if (m == null) {
      System.out.println("해당 이름의 회원이 없습니다!");
      return;
    }

    System.out.printf("이름: %s\n", m.getName());
    System.out.printf("핸드폰 번호: %s\n", m.getPhoneNo());
    System.out.printf("성별: %s\n", toGenderString(m.getGender()));
    System.out.printf("방문 이력: %s\n", toHistoryString(m.getHistory()));
  }

  private Member findByName(String name) {
    for (Member m : this.list) {
      if (m.getName().equals(name)) {
        return m;
      }
    }
    return null;
  }

}
