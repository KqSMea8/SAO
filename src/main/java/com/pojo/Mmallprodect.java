package com.pojo;
import java.math.BigDecimal;


public class Mmallprodect{
	private int prodectid;
	private Mmallcategory categoryid;
	private String prodectname;
	private String prodectsubtitle;
	private String prodectmainimage;
	private String prodectsubimages;
	private String prodectdetail;
	private BigDecimal prodectprice;
	private int prodectstock;
	private String prodectstatus;
	private Date prodectcreatetime;
	private Date prodectupdatetime;
	public void setProdectid(int prodectid){
		this.prodectid=prodectid;
	}
	public int getProdectid(){
		return prodectid;
	}
	public void setCategoryid(Mmallcategory categoryid){
		this.categoryid=categoryid;
	}
	public Mmallcategory getCategoryid(){
		return categoryid;
	}
	public void setProdectname(String prodectname){
		this.prodectname=prodectname;
	}
	public String getProdectname(){
		return prodectname;
	}
	public void setProdectsubtitle(String prodectsubtitle){
		this.prodectsubtitle=prodectsubtitle;
	}
	public String getProdectsubtitle(){
		return prodectsubtitle;
	}
	public void setProdectmainimage(String prodectmainimage){
		this.prodectmainimage=prodectmainimage;
	}
	public String getProdectmainimage(){
		return prodectmainimage;
	}
	public void setProdectsubimages(String prodectsubimages){
		this.prodectsubimages=prodectsubimages;
	}
	public String getProdectsubimages(){
		return prodectsubimages;
	}
	public void setProdectdetail(String prodectdetail){
		this.prodectdetail=prodectdetail;
	}
	public String getProdectdetail(){
		return prodectdetail;
	}
	public void setProdectprice(BigDecimal prodectprice){
		this.prodectprice=prodectprice;
	}
	public BigDecimal getProdectprice(){
		return prodectprice;
	}
	public void setProdectstock(int prodectstock){
		this.prodectstock=prodectstock;
	}
	public int getProdectstock(){
		return prodectstock;
	}
	public void setProdectstatus(String prodectstatus){
		this.prodectstatus=prodectstatus;
	}
	public String getProdectstatus(){
		return prodectstatus;
	}
	public void setProdectcreatetime(Date prodectcreatetime){
		this.prodectcreatetime=prodectcreatetime;
	}
	public Date getProdectcreatetime(){
		return prodectcreatetime;
	}
	public void setProdectupdatetime(Date prodectupdatetime){
		this.prodectupdatetime=prodectupdatetime;
	}
	public Date getProdectupdatetime(){
		return prodectupdatetime;
	}
}