package com.service.com.service.Impl;

import com.dao.IStuDao;
import com.entity.Stu;
import com.service.IStuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


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

	@Override
	public boolean updateStu(Stu stu) {
		return stuDao.updateStu(stu);
	}

	@Override
	public Stu findStuListById(int id) {
		return stuDao.findStuListById(id);
	}

}
