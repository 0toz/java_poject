package com.ict03.class01;

public class Ex13 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;

	public Ex13() {
		// TODO Auto-generated constructor stub
	}
	
	public Ex13(String name , int kor , int eng, int math) {
		this.name = name;
		this.sum = kor + eng + math;
		p_avg();
		p_hak();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// 이름받기, 총점구하기, 평균구하기 , 학점구하기 , 순위와 정렬은 여기서 못함.
	// 모든 메소드가 보이드이다.
	// 총점구하기
	public void p_sum(int kor, int eng, int math) {
		sum = kor + eng + math;

	}

	public void p_avg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;

	}

	// 학점구하기
	public void p_hak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else
			hak = "F학점";
	}

}
