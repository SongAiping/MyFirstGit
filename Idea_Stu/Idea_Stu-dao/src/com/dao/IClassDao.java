package com.dao;

import com.entity.TbClass;

import java.util.List;

public interface IClassDao {
	
	public boolean addClass(TbClass cls);
	
	public List findClassList(String hql);
}	
