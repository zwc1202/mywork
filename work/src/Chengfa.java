package com.yysy.work;

public class Chengfa{
    public static void main(String[] args){
	    Chengfa cheng = new Chengfa();
		cheng.cheng1();
	}
	public void cheng1(){
	    for(int j=9;j>=1;j--){
	       for (int i=1;i<=j ;i++ )
	       {    
		      String space="";
			  if(i*j<=9){
			      space = " ";
			  }
		      System.out.print(i+"*"+j+"="+space+(i*j)+"  ");
	     }
		 System.out.println();
	   }   
    }
}