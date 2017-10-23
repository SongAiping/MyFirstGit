package com.stu.service;

import java.util.List;

import com.stu.entity.Class;

public interface IClassSevice {

	public boolean addClass(Class cls);
	
	public List findClassList();
}
