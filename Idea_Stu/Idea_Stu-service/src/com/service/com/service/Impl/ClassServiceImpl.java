package com.service.com.service.Impl;

import com.dao.IClassDao;
import com.entity.TbClass;
import com.service.IClassSevice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class ClassServiceImpl implements IClassSevice {
	
	@Resource(name="clsDao")
	private IClassDao clsDao;

    @Override
    public boolean addClass(TbClass cls) {
        return clsDao.addClass(cls);
    }

    @Override
	public List findClassList() {
		return clsDao.findClassList("from TbClass");
	}

	public void setClsDao(IClassDao clsDao) {
		this.clsDao = clsDao;
	}
	
}
