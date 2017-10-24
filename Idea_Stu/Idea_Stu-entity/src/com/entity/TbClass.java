package com.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/10/24.
 */

@Entity
@Table(name="tb_cls")
public class TbClass {
    private int cno;
    private String cname;

    public TbClass() {
        super();
    }

    public TbClass(int cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
