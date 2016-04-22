package com.yysy.work;

public class Computer{
    private String name;
	private String type;
    public Computer(String name,String type){
        this.name=name;
		this.type=type;
	}
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return this.name;
	}
	public void setType(String type){
	    this.type=type;
	}
	public String getType(){
	    return this.type;
	}
	public String toString(){
	    return "Computer [name :"+this.name
			    +",type:"+this.type
			    +"]";
    }
}