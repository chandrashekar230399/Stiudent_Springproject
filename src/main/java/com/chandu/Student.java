package com.chandu;

public class Student {

	private int stdId;
	private String stdName;
	private double stdFee;

	private int s1;
	private int s2;
	private int s3;
	

	public Student(int stdId, String stdName, double stdFee, int s1, int s2, int s3) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		

	}
	

	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public double getStdFee() {
		return stdFee;
	}


	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}


	public int getS1() {
		return s1;
	}


	public void setS1(int s1) {
		this.s1 = s1;
	}


	public int getS2() {
		return s2;
	}


	public void setS2(int s2) {
		this.s2 = s2;
	}


	public int getS3() {
		return s3;
	}


	public void setS3(int s3) {
		this.s3 = s3;
	}


	public void printDetails() {
		System.out.println("========Student_Details:========");
		System.out.println("StdId=" + stdId);
		System.out.println("StdName=" + stdName);
		System.out.println("Stdfee=" + stdFee);
	}

	public void printTotal() {
		int total = s1 + s2 + s3 ;
		System.out.println("Total:" + total);
	}

	public void printAvg() {
		int total = s1 + s2 + s3 ;
		float avg = total / 3;
		System.out.println("Average:" + avg);
	}

}
