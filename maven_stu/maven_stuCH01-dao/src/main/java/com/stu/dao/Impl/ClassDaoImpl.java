package com.stu.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.IClassDao;
import com.stu.entity.Class;

@Repository("clsDao")
public class ClassDaoImpl extends BaseDao implements IClassDao {

	
	public boolean addClass(Class cls) {
		getSession().save(cls);
		return true;
	}

	public List findClassList(String hql) {
		return getSession().createQuery(hql).list();
	}

}
