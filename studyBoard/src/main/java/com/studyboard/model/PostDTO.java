package com.studyboard.model;

import java.sql.Date;

public class PostDTO {
	int pid;
	String ptitle;
	Date pdate;
	String poster;
	String pcontent;
	String attach;
	
	public PostDTO() {
		
	}
	
	public PostDTO(int pid, String ptitle, Date pdate, String poster, String pcontent, String attach) {
		super();
		this.pid = pid;
		this.ptitle = ptitle;
		this.pdate = pdate;
		this.poster = poster;
		this.pcontent = pcontent;
		this.attach = attach;
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
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}

	@Override
	public String toString() {
		return "PostDTO [pid=" + pid + ", ptitle=" + ptitle + ", pdate=" + pdate + ", poster=" + poster + ", pcontent="
				+ pcontent + ", attach=" + attach + "]";
	}
	
	
}
