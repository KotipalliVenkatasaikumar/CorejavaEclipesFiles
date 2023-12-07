package com.corenuts.java12_07_23;

public class Array {

	public static void main(String[] args) {
		String[] StudentName =new String[4];
		StudentName[0]="sai";
		StudentName[1]="karthik";
		StudentName[2]="sampath";
		StudentName[3]="himaja";
		for(int i=0;i<StudentName.length;i++) {
			System.out.println("studentnames="+ StudentName[i] );
			String name=StudentName[i];
			if(name.equals("sai")) {
		    System.out.println("yes");
			break;
			
			
			}
		}
	}
}
		
	


