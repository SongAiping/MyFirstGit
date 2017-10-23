package com.stu.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.stu.entity.Stu;
import com.stu.service.IClassSevice;
import com.stu.service.IStuService;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {
	
	private Stu stu;
	
	@Resource(name="clsService")
	private IClassSevice clsService;
	@Resource(name="stuService")
	private IStuService stuService;
	
	//添加学生-----去到添加页面
	public String toAddStu(){
		ActionContext.getContext().put("clsList", clsService.findClassList());
		return "addStu";
	}
	
	//添加学生操作
	public String doAddStu(){
		stuService.addStu(stu);
		return "doAdd";
	}
	
	//查询学生信息
	public String findStuList(){
		ActionContext.getContext().put("stuList", stuService.findStuList());
		return "stuList";
	}

	//删除学生
	public String deleteStu(){
		stuService.deleteStu(stu);
		return "deleteStu";
	}
	
	//-------------------------------------------------
	
	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public void setClsService(IClassSevice clsService) {
		this.clsService = clsService;
	}

	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
	
	
	
}
