package com.dao.com.dao.Impl;

import com.dao.IStuDao;
import com.entity.Stu;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("ALL")
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

    @Override
    public Stu findStuListById(int id) {
        return getSession().get(Stu.class,id);
    }

    @Override
	public boolean updateStu(Stu stu) {
		getSession().update(stu);
		return true;
	}


}
