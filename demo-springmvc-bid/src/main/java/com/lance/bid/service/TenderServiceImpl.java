package com.lance.bid.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lance.bid.mapper.BorrowMapper;
import com.lance.bid.mapper.TenderMapper;
import com.lance.bid.mapper.UserMapper;
import com.lance.bid.model.UserInfo;

@Service
public class TenderServiceImpl implements TenderService {
	@Autowired
	private BorrowMapper borrowMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TenderMapper tenderMapper;

	/**
	 * 用户投标
	 * @param tenderUserId	投标用户id
	 * @param total			投标金额
	 * @param borrowId		投的标id
	 * @return
	 */
	@Transactional
	public String tender(int tenderUserId, BigDecimal total, int borrowId) {
		return null;
	}

	/**
	 * 初始化用户
	 * @param info
	 */
	@Transactional
	public void initUser(UserInfo info) {
		userMapper.save(info);
	}
}