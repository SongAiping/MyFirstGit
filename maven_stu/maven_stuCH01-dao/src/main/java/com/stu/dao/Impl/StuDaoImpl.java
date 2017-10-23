package com.stu.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.IStuDao;
import com.stu.entity.Stu;

@Repository("stuDao")
public class StuDaoImpl extends BaseDao implements IStuDao {
	
	public boolean addStu(Stu stu) {
		getSession().save(stu);
		return true;
	}

	public List findStuList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean deleteStu(Stu stu) {
		getSession().delete(stu);
		return true;
	}
	

}
