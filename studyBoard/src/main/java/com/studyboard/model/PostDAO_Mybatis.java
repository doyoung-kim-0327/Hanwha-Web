package com.studyboard.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PostDAO_Mybatis {
	@Autowired
	SqlSession session;

	public List<PostDTO> selectAllQPost() {
		return session.selectList("com.studyboard.selectallposter");
	}

	public List<PostDTO> selectAllByPoster(String poster) {
		return session.selectList("com.studyboard.selectallbyposter", poster);
	}
	
	public PostDTO selectByTitle(String ptitle) {
		return session.selectOne("com.studyboard.selectbyptitle", ptitle);
	}
	
	public PostDTO selectById(int pid) {
		return session.selectOne("com.studyboard.selectbypid", pid);
	}
	
	
	public int insertPost(PostDTO post) {
		return session.insert("com.studyboard.pinsert", post);
	}

	public int editPost(PostDTO post) {
		return session.update("com.studyboard.pedit", post);
	}
	
	public int deletePost(int pid) {
		return session.delete("com.studyboard.pdelete", pid);
	}

	
}