package ui;

import dao.MemberDAO;
import vo.Member;

public class MamberMain {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		
		Member member = new Member();
		member.setMember_name("±èÃ¶¼ö");
		member.setMember_age(20);
		member.setMember_phone("010-111-2222");
		member.setMember_address("¼­¿ï½Ã °­³²±¸");
		
		dao.insertMember(member);
	}
}
