package com.yysy.work;

public class School{
    private String name;
	private String address;
	private long postcode;
	public School(String name,String address,long postcode){
        this.name=name;
		this.address=address;
		this.postcode=postcode;
	}
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return this.name;
	}
	public void setAddress(String address){
	    this.address=address;
	}
	public String getAddress(){
	    return this.address;
	}
	public void setPostcode(long postcode){
	    this.postcode=postcode;
	}
	public long getPostcode(){
	    return this.postcode;
	}
	public String toString(){
	    return "School [name :"+this.name
			    +",address:"+this.address
			    +",postcode:"+this.postcode
			    +"]";
		}
}