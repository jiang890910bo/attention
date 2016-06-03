package com.lance.shiro.mapper;

import java.util.List;

import com.lance.shiro.model.ModuleInfo;

public interface ModuleMapper {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleKey(int userId);
}
