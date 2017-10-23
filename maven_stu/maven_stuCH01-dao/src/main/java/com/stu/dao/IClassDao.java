package com.stu.dao;
import java.util.List;

import com.stu.entity.Class;


public interface IClassDao {
	
	public boolean addClass(Class cls);
	
	public List findClassList(String hql);
}	
