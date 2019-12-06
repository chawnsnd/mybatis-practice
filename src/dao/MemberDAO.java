package dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Member;

public class MemberDAO {
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void insertMember(Member member) {
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			// 클래스.class -> 해당클래스의 정보 반환
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			memberMapper.insertMember(member);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();						
		}
		
	}
	
	public Member searchMember(int member_no) {
		SqlSession session = null;
		Member member = null;
		try {
			session = factory.openSession();
			// 클래스.class -> 해당클래스의 정보 반환
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			member = memberMapper.selectMember(member_no);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return member;
	}
	
	public List<Member> ListAllMember() {
		SqlSession session = null;
		List<Member>members = new ArrayList<Member>();
		try {
			session = factory.openSession();
			// 클래스.class -> 해당클래스의 정보 반환
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			members = memberMapper.selectAllMembers();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return members;
	}
	
	public void updateMember(Member member) {
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			// 클래스.class -> 해당클래스의 정보 반환
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			memberMapper.updateMember(member);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();						
		}
	}
	
	public void deleteMember(int member_no) {
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			// 클래스.class -> 해당클래스의 정보 반환
			MemberMapper memberMapper = session.getMapper(MemberMapper.class);
			memberMapper.deleteMember(member_no);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();						
		}
	}
}
