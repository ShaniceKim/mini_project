package bitcamp.myapp.handler;

import static bitcamp.myapp.handler.AbstractMemberListener.toHistoryString;
import java.util.Iterator;
import java.util.List;
import bitcamp.myapp.vo.Member;
import bitcamp.util.BreadcrumbPrompt;

public class MemberListListener extends AbstractMemberListener {

  public MemberListListener(List<Member> list) {
    super(list);
  }

  @Override
  public void service(BreadcrumbPrompt prompt) {
    System.out.println("---------------------------------------");
    System.out.println("번호, 이름, 핸드폰 번호, 성별, 방문이력");
    System.out.println("---------------------------------------");

    // 목록에서 데이터를 대신 꺼내주는 객체를 얻는다.
    Iterator<Member> iterator = list.iterator();
    while (iterator.hasNext()) {
      Member m = iterator.next();
      System.out.printf("%s, %s, %s, %s\n", m.getName(), m.getPhoneNo(),
          toGenderString(m.getGender()), toHistoryString(m.getHistory()));
    }
  }

}
