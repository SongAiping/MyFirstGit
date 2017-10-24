package com.service;

import com.entity.TbClass;

import java.util.List;

public interface IClassSevice {

	public boolean addClass(TbClass cls);
	
	public List findClassList();
}
