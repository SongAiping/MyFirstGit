package com.stu.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stu.dao.IStuDao;
import com.stu.entity.Stu;
import com.stu.service.IStuService;

@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuServiceImpl implements IStuService {
	
	@Resource(name="stuDao")
	private IStuDao stuDao;
		
	public boolean addStu(Stu stu) {
		return stuDao.addStu(stu);
	}

	public List findStuList() {
		return stuDao.findStuList("from Stu s inner join s.cls");
	}

	public void setStuDao(IStuDao stuDao) {
		this.stuDao = stuDao;
	}

	@Override
	public boolean deleteStu(Stu stu) {
		return stuDao.deleteStu(stu);
	}
	
}
