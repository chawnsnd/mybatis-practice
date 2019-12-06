package dao;

import java.util.ArrayList;

import vo.Member;

public interface MemberMapper {

	// mapper.xml�� id�� ���Բ� ����
	public int insertMember(Member member);
	
	public ArrayList<Member> selectAllMembers();
	
	public Member selectMember(int member_no);
	
	public int updateMember(Member member);
	
	public int deleteMember(int member_no);
}
