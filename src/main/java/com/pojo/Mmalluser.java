package com.pojo;
import java.util.Date;


public class Mmalluser{
	private int userid;
	private String username;
	private String userpassword;
	private String useremail;
	private String userphone;
	private String userquestion;
	private String useranswer;
	private String userrole;
	private Date usercreatetime;
	private Date userupdatetime;
	public void setUserid(int userid){
		this.userid=userid;
	}
	public int getUserid(){
		return userid;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setUserpassword(String userpassword){
		this.userpassword=userpassword;
	}
	public String getUserpassword(){
		return userpassword;
	}
	public void setUseremail(String useremail){
		this.useremail=useremail;
	}
	public String getUseremail(){
		return useremail;
	}
	public void setUserphone(String userphone){
		this.userphone=userphone;
	}
	public String getUserphone(){
		return userphone;
	}
	public void setUserquestion(String userquestion){
		this.userquestion=userquestion;
	}
	public String getUserquestion(){
		return userquestion;
	}
	public void setUseranswer(String useranswer){
		this.useranswer=useranswer;
	}
	public String getUseranswer(){
		return useranswer;
	}
	public void setUserrole(String userrole){
		this.userrole=userrole;
	}
	public String getUserrole(){
		return userrole;
	}
	public void setUsercreatetime(Date usercreatetime){
		this.usercreatetime=usercreatetime;
	}
	public Date getUsercreatetime(){
		return usercreatetime;
	}
	public void setUserupdatetime(Date userupdatetime){
		this.userupdatetime=userupdatetime;
	}
	public Date getUserupdatetime(){
		return userupdatetime;
	}
}