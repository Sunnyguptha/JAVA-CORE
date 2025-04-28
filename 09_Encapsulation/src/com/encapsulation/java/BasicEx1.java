package com.encapsulation.java;

class Student5  
{  
 private int sno;  
 private String sname;  
 private String dname;  
 public void setSno(int sno)  
 {  
  this.sno=sno;  
 }  
 public void setSname(String sname)  
 {  
  this.sname=sname;  
 }  
 public void setDname(String dname)  
 {  
  this.dname=dname;  
 }  
 public void getSno()  
 {  
  if(sno>0)  
  {  
   System.out.println("valid"+sno);  
  }  
  else  
  {  
   System.out.println("Invalid donot use ultra pro knowledge");  
  
  }  
 }  
 public void getSname()  
 {  
  System.out.println(sname);  
  
 }  
 public void getDname()  
 {  
  System.out.println(dname);  
  
 }  
  
}  
public class BasicEx1  
{  
 public static void main(String[] args)  
 {  
  Student5 s1=new Student5();  
  s1.setSno(97);  
  s1.setSname("AjayKumar");  
  s1.setDname("ECE");  
  s1.getSno();  
  s1.getSname();  
  s1.getDname();  
  
  
 }  
   
} 