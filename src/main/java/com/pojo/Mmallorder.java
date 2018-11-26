package com.pojo;
import java.math.BigDecimal;


public class Mmallorder{
	private int orderid;
	private String payorderno;
	private Mmalluser userid;
	private Mmallshipping shippingid;
	private int payment;
	private String paymenttype;
	private BigDecimal postage;
	private String orderstatus;
	private Date paymenttime;
	private Date sendtime;
	private Date endtime;
	private Date closetime;
	private Date ordercreatetime;
	private Date orderupdatetime;
	public void setOrderid(int orderid){
		this.orderid=orderid;
	}
	public int getOrderid(){
		return orderid;
	}
	public void setPayorderno(String payorderno){
		this.payorderno=payorderno;
	}
	public String getPayorderno(){
		return payorderno;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setShippingid(Mmallshipping shippingid){
		this.shippingid=shippingid;
	}
	public Mmallshipping getShippingid(){
		return shippingid;
	}
	public void setPayment(int payment){
		this.payment=payment;
	}
	public int getPayment(){
		return payment;
	}
	public void setPaymenttype(String paymenttype){
		this.paymenttype=paymenttype;
	}
	public String getPaymenttype(){
		return paymenttype;
	}
	public void setPostage(BigDecimal postage){
		this.postage=postage;
	}
	public BigDecimal getPostage(){
		return postage;
	}
	public void setOrderstatus(String orderstatus){
		this.orderstatus=orderstatus;
	}
	public String getOrderstatus(){
		return orderstatus;
	}
	public void setPaymenttime(Date paymenttime){
		this.paymenttime=paymenttime;
	}
	public Date getPaymenttime(){
		return paymenttime;
	}
	public void setSendtime(Date sendtime){
		this.sendtime=sendtime;
	}
	public Date getSendtime(){
		return sendtime;
	}
	public void setEndtime(Date endtime){
		this.endtime=endtime;
	}
	public Date getEndtime(){
		return endtime;
	}
	public void setClosetime(Date closetime){
		this.closetime=closetime;
	}
	public Date getClosetime(){
		return closetime;
	}
	public void setOrdercreatetime(Date ordercreatetime){
		this.ordercreatetime=ordercreatetime;
	}
	public Date getOrdercreatetime(){
		return ordercreatetime;
	}
	public void setOrderupdatetime(Date orderupdatetime){
		this.orderupdatetime=orderupdatetime;
	}
	public Date getOrderupdatetime(){
		return orderupdatetime;
	}
}