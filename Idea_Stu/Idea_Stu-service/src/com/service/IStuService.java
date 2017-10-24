package com.service;

import com.entity.Stu;

import java.util.List;


public interface IStuService {
	
	public boolean addStu(Stu stu);
	
	public List findStuList();
	
	public boolean deleteStu(Stu stu);

	public boolean updateStu(Stu stu);

	public Stu findStuListById(int id);
}
