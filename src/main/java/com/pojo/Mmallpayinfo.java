package com.pojo;
import java.util.Date;


public class Mmallpayinfo{
	private int payid;
	private Mmalluser userid;
	private String payorderno;
	private String payplatform;
	private String platformnumber;
	private String platformstatus;
	private Date paycreatetime;
	private Date payupdatetime;
	public void setPayid(int payid){
		this.payid=payid;
	}
	public int getPayid(){
		return payid;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setPayorderno(String payorderno){
		this.payorderno=payorderno;
	}
	public String getPayorderno(){
		return payorderno;
	}
	public void setPayplatform(String payplatform){
		this.payplatform=payplatform;
	}
	public String getPayplatform(){
		return payplatform;
	}
	public void setPlatformnumber(String platformnumber){
		this.platformnumber=platformnumber;
	}
	public String getPlatformnumber(){
		return platformnumber;
	}
	public void setPlatformstatus(String platformstatus){
		this.platformstatus=platformstatus;
	}
	public String getPlatformstatus(){
		return platformstatus;
	}
	public void setPaycreatetime(Date paycreatetime){
		this.paycreatetime=paycreatetime;
	}
	public Date getPaycreatetime(){
		return paycreatetime;
	}
	public void setPayupdatetime(Date payupdatetime){
		this.payupdatetime=payupdatetime;
	}
	public Date getPayupdatetime(){
		return payupdatetime;
	}
}