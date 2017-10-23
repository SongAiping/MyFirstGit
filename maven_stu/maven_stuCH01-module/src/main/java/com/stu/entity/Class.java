package com.stu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_class")
public class Class {
	private int cno;
	private String cname;
	public Class() {
		super();
	}
	public Class(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
