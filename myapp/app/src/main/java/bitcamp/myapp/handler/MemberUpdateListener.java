package bitcamp.myapp.handler;

import java.util.List;
import bitcamp.myapp.vo.Member;
import bitcamp.util.BreadcrumbPrompt;

public class MemberUpdateListener extends AbstractMemberListener {

  public MemberUpdateListener(List<Member> list) {
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

    m.setName(prompt.inputString("이름(%s)? ", m.getName()));
    m.setPhoneNo(prompt.inputString("핸드폰 번호(%s)? ", m.getPhoneNo()));
    m.setPassword(prompt.inputString("새 암호? "));
    m.setGender(inputGender(m.getGender(), prompt));
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
