package com.stu.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.stu.entity.Class;
import com.stu.service.IClassSevice;

@Controller("clsAction")
@Scope("prototype")
public class ClassAction {
	private Class cls;

	@Resource(name="clsService")
	private IClassSevice clsSerive; 
	
	//添加班级
	public String addClass(){
		clsSerive.addClass(cls);
		return "index";
	}
	
	//查询班级
	/*public String findClassList(){
		ActionContext.getContext().put("clsList", clsSerive.findClassList());
		return "clsList";
	}
	*/
	
	public Class getCls() {
		return cls;
	}
	public void setCls(Class cls) {
		this.cls = cls;
	}
	public void setClsService(IClassSevice clsSerive) {
		this.clsSerive = clsSerive;
	}
	
}
