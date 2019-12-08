package com.sonbro.emotion.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sonbro.emotion.vo.EmotionVO;

@Repository
public class EmotionDao {
	@Autowired
	private SqlSession sqlSession;
	
	public void insertUser(EmotionVO ev) throws Exception {
		sqlSession.insert("emotion.user_insert", ev);
	}
}
