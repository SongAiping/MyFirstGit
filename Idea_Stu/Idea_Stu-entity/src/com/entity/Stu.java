package com.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_stu")
public class Stu {
	private int sno;
	private String sname;
	private String ssex;
	private String sage;
	private String sdate;

	private TbClass cls;
		
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="scno")
	public TbClass getCls() {
		return cls;
	}
	public void setCls(TbClass cls) {
		this.cls = cls;
	}
}
