package ui;

import java.util.List;

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
		List<Member> members = dao.ListAllMember();
		for (Member m : members) {
			System.out.println(m.toString());
		}
		
		dao.searchMember(1);
		
		dao.updateMember(member);
		
		dao.deleteMember(1);
		
	}
}
