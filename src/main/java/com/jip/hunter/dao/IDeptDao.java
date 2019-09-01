package com.jip.hunter.dao;

import com.jip.hunter.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Time:2018/11/15 19:39
 * @Author:Jip
 * @Version:1.0
 */
@Mapper
public interface IDeptDao {
	Dept getDeptById(Integer id);

	List<Dept> getAll();
}
