package com.studyboard.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	@Autowired
	DataSource ds;
	
	public int insertMem(MemberDTO mem) {
		Connection conn = null;
		PreparedStatement st = null;
		int result = 0;
		String sql = "insert into accounts values(?,?,?)";
		try {
			conn = ds.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1, mem.getMid());
			st.setString(2, mem.getMname());
			st.setString(3, mem.getPw());
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
