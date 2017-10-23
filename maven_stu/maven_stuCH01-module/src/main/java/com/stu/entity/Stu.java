package com.stu.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_stu")
public class Stu {
	private int sno;
	private String sname;
	private String ssex;
	private String sage;
	private String sdate;
	
	private Class cls;
		
	public Stu() {
		super();
	}
	public Stu(int sno, String sname, String ssex, String sage, String sdate) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.sdate = sdate;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.EAGER)
	@JoinColumn(name="scno")
	public Class getCls() {
		return cls;
	}
	public void setCls(Class cls) {
		this.cls = cls;
	}
	
}
