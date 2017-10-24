package com.dao.com.dao.Impl;

import com.dao.IClassDao;
import com.entity.TbClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("ALL")
@Repository("clsDao")
public class ClassDaoImpl extends BaseDao implements IClassDao {

	@Override
	public boolean addClass(TbClass cls) {
		getSession().save(cls);
		return true;
	}

	public List findClassList(String hql) {
		return getSession().createQuery(hql).list();
	}


}
