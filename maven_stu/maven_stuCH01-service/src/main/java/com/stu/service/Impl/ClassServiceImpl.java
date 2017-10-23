package com.stu.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stu.dao.IClassDao;
import com.stu.entity.Class;
import com.stu.service.IClassSevice;

@Service("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class ClassServiceImpl implements IClassSevice {
	
	@Resource(name="clsDao")
	private IClassDao clsDao;

	@Override
	public boolean addClass(Class cls) {
		return clsDao.addClass(cls);
	}

	@Override
	public List findClassList() {
		return clsDao.findClassList("from Class");
	}

	public void setClsDao(IClassDao clsDao) {
		this.clsDao = clsDao;
	}
	
}
