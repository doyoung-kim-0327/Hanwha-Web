package com.studyboard.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO_Mybatis {
	
	@Autowired
	SqlSession session;

	public List<MemberDTO> selectAll() {
		return session.selectList("com.studyboard.selectall");
	}
	
	public MemberDTO selectById(String mid) {
		return session.selectOne("com.studyboard.selectbyid", mid);
	}
	
	public int insert(MemberDTO mem) {
		return session.insert("com.studyboard.insert", mem);
	}

}
