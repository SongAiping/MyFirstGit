package com.dao;

import com.entity.Stu;

import java.util.List;

public interface IStuDao {
	
	public boolean addStu(Stu stu);
	
	public List findStuList(String hql);
	
	public boolean deleteStu(Stu stu);

	public Stu findStuListById(int id);

	public boolean updateStu(Stu stu);
}
