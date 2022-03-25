package com.mire.phone_project;

import java.util.Objects;

public class PhoneBook implements Comparable<Object> {
	//멤버변수, 이름, 성별, 나이, 전화번호, 직업
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String job; 
	
	//디폴트생성자
	public PhoneBook() {
		this(null, null, 0, null, null);
	}
	//매개변수생성자
	public PhoneBook(String name, String gender, int age, String phone, String job) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}
	//오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(phone);
	}
	@Override
	public boolean equals(Object objct) {
		boolean flag = false;
		//예외처리를 시킨다. obj가 phonebook으로 들어가는게 아닌것.
		if(!(objct instanceof PhoneBook)) {
			throw new IllegalArgumentException("PhoneBook Class가 없습니다.");
		}
			PhoneBook pb = (PhoneBook)objct;
			if(this.phone.equals(pb.phone)) {
				flag = true;
			}
			
		return flag;
	}
	//오버라이딩 : compareTo : 이름 name 
	@Override
	public int compareTo(Object obj) {
		int value = 0;
		if(!(obj instanceof PhoneBook)) {
			throw new IllegalArgumentException("PhoneBook Class가 없습니다.");
		}
		PhoneBook pb = (PhoneBook)obj;	
		//만약 "ABC" 나 "ADC"를 비교하면 K하고 L을 비교 A(65)-A을 빼면 0 B(66)-D(68)는 -2  이런식으로 이름도 비교가 가능하다.
		//그렇기에 compareTo(pb.name) 한줄만적으면 된다.
		return this.name.compareTo(pb.name);
	}
	//오버라이딩 : toString
	@Override
	public String toString() {
		return " [name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", job=" + job
				+ "]";
	}
	
	//게터, 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
