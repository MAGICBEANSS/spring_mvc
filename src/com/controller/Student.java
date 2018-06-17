package com.controller;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {

	String fname;
	String lname;
	int rollno;
	ArrayList <String> hobbylist;
	HashSet <String> hsa;
	public HashSet<String> getHsa() {
		return hsa;
	}
	public void setHsa(HashSet<String> hsa) {
		this.hsa = hsa;
	}
	public int getRollno() {
		return rollno;
	}
	public ArrayList<String> getHobbylist() {
		return hobbylist;
	}
	public void setHobbylist(ArrayList<String> hobbylist) {
		this.hobbylist = hobbylist;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
