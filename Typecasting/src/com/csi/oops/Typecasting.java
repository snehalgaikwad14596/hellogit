/**
 * 
 */
package com.csi.oops;

import java.sql.Date;

public class Typecasting {

	public static void main(String[] args) {
	
int a=300;
byte b=(byte)a;
System.out.println(b);
int d='a';
System.out.println(d);
String c="101";
int D=Integer.parseInt(c);
System.out.println(D);
int e=356;
String ss=String.valueOf(e);
System.out.println(ss);
String n="12345667";
long l=Long.parseLong(n);
System.out.println(l);
	long K=8796443542L;
	String j=String.valueOf(K);
	System.out.println(j);
	String u="23.32";
	float f=Float.parseFloat(u);
	System.out.println(f);
	float f1=23.33F;
	String S1=String.valueOf(f1);
	System.out.println(S1);
	String s2="44.9";
	Double d1=Double.parseDouble(s2);
	System.out.println(d1);
	double S3=88.98;
	String S4=String.valueOf(S3);
	System.out.println(S4);
	String D1="Hello";
	char c11=D1.charAt(1);
	System.out.println(c11);
	char c2='H';
	String s9=String.valueOf(c2);
	System.out.println(s9);
	String s7="I AM FROM PUNE";
	Object m=s7;
	System.out.println(m);
	Typecasting Y=new Typecasting();
	String s0=String.valueOf(Y);
	System.out.println(s0);
	int i=100000;
	Long l1=Long.valueOf(i);
	System.out.println(l1);
	long x=500000;
	int i2=(int)x;
	System.out.println(i2);
	int i5=98;
	double d0=i5;
	System.out.println(d0);
	double dc=88.98;
	int k=(int)dc;
	System.out.println(k);
	char c5='s';
	int h=c5;
	System.out.println(h);
	int o=90;
	char v1=(char)o;
	System.out.println(v1);
	//String c1="ok";
	String c1="false";
	boolean hh=Boolean.parseBoolean(c1);
	System.out.println(hh);
	boolean vv=true;
	String bn=String.valueOf(vv);
	System.out.println(bn);
	System.out.println(Integer.parseInt("1010",2));  
	System.out.println(Integer.toBinaryString(21));
	String hex="b";
	int decimal=Integer.parseInt(hex,16);
	System.out.println(decimal);
	System.out.println(Integer.toHexString(15));
	String octal="121";
	int decimal11=Integer.parseInt(octal,8);
	System.out.println(decimal11);
	System.out.println(Integer.toOctalString(81));  
	
	
	
		
	
	
	
	
	
	}

}
