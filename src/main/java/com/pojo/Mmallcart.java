package com.pojo;
import java.util.Date;


public class Mmallcart{
	private int cartid;
	private Mmalluser userid;
	private Mmallprodect prodectid;
	private int cartquantity;
	private String cartchecked;
	private Date cartcreatetime;
	private Date cartupdatetime;
		this.cartid=cartid;
	}
	public int getCartid(){
		return cartid;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setProdectid(Mmallprodect prodectid){
		this.prodectid=prodectid;
	}
	public Mmallprodect getProdectid(){
		return prodectid;
	}
	public void setCartquantity(int cartquantity){
		this.cartquantity=cartquantity;
	}
	public int getCartquantity(){
		return cartquantity;
	}
	public void setCartchecked(String cartchecked){
		this.cartchecked=cartchecked;
	}
	public String getCartchecked(){
		return cartchecked;
	}
	public void setCartcreatetime(Date cartcreatetime){
		this.cartcreatetime=cartcreatetime;
	}
	public Date getCartcreatetime(){
		return cartcreatetime;
	}
	public void setCartupdatetime(Date cartupdatetime){
		this.cartupdatetime=cartupdatetime;
	}
	public Date getCartupdatetime(){
		return cartupdatetime;
	}
}