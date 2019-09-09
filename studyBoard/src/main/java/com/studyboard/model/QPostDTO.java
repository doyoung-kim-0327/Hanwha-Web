package com.studyboard.model;

import java.sql.Date;

public class QPostDTO {
	int pid;
	String ptitle;
	Date pdate;
	String poster;
	String pcontent;
	int hit;
	int comno;
	
	public QPostDTO() {
		
	}
	
	
	public QPostDTO(int pid, String ptitle, Date pdate, String poster, String pcontent, int hit, int comno) {
		super();
		this.pid = pid;
		this.ptitle = ptitle;
		this.pdate = pdate;
		this.poster = poster;
		this.pcontent = pcontent;
		this.hit = hit;
		this.comno = comno;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}


	public int getComno() {
		return comno;
	}


	public void setComno(int comno) {
		this.comno = comno;
	}


	@Override
	public String toString() {
		return "QPostDTO [pid=" + pid + ", ptitle=" + ptitle + ", pdate=" + pdate + ", poster=" + poster + ", pcontent="
				+ pcontent + ", hit=" + hit + ", comno=" + comno + "]";
	}
	

	
	
}
