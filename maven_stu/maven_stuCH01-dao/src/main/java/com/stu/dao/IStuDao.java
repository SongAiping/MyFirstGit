package com.stu.dao;

import java.util.List;

import com.stu.entity.Stu;

public interface IStuDao {
	
	public boolean addStu(Stu stu);
	
	public List findStuList(String hql);
	
	public boolean deleteStu(Stu stu);
}
