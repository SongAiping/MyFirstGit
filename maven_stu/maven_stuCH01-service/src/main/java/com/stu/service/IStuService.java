package com.stu.service;

import java.util.List;

import com.stu.entity.Stu;

public interface IStuService {
	
	public boolean addStu(Stu stu);
	
	public List findStuList();
	
	public boolean deleteStu(Stu stu);
}
