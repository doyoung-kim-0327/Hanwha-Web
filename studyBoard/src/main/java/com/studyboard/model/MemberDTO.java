package com.studyboard.model;

public class MemberDTO {
	String mid;
	String mname;
	String pw;
	String photo;

	public MemberDTO() {
		
	}
	
	
	public MemberDTO(String mid, String mname, String pw, String photo) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.pw = pw;
		this.photo = photo;
	}


	public String getMid() {
		return mid;
	}
	
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	public String getMname() {
		return mname;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mname=" + mname + ", pw=" + pw + ", photo=" + photo + "]";
	}

	
}
