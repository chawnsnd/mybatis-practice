package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDAO {
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void insertMember(Member member) {
		SqlSession session = null;
		
		session = factory.openSession();
		session.getMapper();
	}
}
