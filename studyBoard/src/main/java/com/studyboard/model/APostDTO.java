package com.studyboard.model;

import java.sql.Timestamp;

public class APostDTO {
	int pid;
	Timestamp pdate;
	String poster;
	String pcontent;
	
	public APostDTO() {
		
	}
	
	public APostDTO(int pid, Timestamp pdate, String poster, String pcontent) {
		super();
		this.pid = pid;
		this.pdate = pdate;
		this.poster = poster;
		this.pcontent = pcontent;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Timestamp getPdate() {
		return pdate;
	}
	public void setPdate(Timestamp pdate) {
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

	@Override
	public String toString() {
		return "APostDTO [pid=" + pid + ", pdate=" + pdate + ", poster=" + poster + ", pcontent=" + pcontent + "]";
	}
	
	
}
