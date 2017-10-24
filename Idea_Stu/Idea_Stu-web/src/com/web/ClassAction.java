package com.web;

import com.entity.TbClass;
import com.service.IClassSevice;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("clsAction")
@Scope("prototype")
public class ClassAction {
	private TbClass cls;

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
	
	public TbClass getCls() {
		return cls;
	}
	public void setCls(TbClass cls) {
		this.cls = cls;
	}
	public void setClsService(IClassSevice clsSerive) {
		this.clsSerive = clsSerive;
	}
	
}
