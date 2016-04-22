package com.yysy.work;

public class Teacher{
    private String name;
	private int age;
	private String course;
	public Teacher(String name,int age,String course){
	    this.name=name;
        this.age=age;
		this.course=course;
		}
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return this.name;
	}
	public void setAge(int age){
	    this.age=age;
	}
	public int getAge(){
	    return this.age;
	}
	public void setCourse(String course){
	    this.course=course;
	}
	public String getCourse(){
	    return this.course;
	}
    public String toString(){
	    return "Teacher [name :"+this.name
			    +",age:"+this.age
			    +",course:"+this.course
			    +"]";
	}
}