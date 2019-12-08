package com.sonbro.emotion.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sonbro.emotion.dao.EmotionDao;
import com.sonbro.emotion.vo.EmotionVO;

@Service
public class EmotionService {
	@Inject
	private EmotionDao dao;
	
	public void insertUser(EmotionVO ev) throws Exception {
		dao.insertUser(ev);
	}
}
