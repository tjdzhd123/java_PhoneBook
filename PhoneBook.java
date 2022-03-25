package com.mire.phone_project;

import java.util.Objects;

public class PhoneBook implements Comparable<Object> {
	//�������, �̸�, ����, ����, ��ȭ��ȣ, ����
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String job; 
	
	//����Ʈ������
	public PhoneBook() {
		this(null, null, 0, null, null);
	}
	//�Ű�����������
	public PhoneBook(String name, String gender, int age, String phone, String job) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}
	//�������̵�
	@Override
	public int hashCode() {
		return Objects.hash(phone);
	}
	@Override
	public boolean equals(Object objct) {
		boolean flag = false;
		//����ó���� ��Ų��. obj�� phonebook���� ���°� �ƴѰ�.
		if(!(objct instanceof PhoneBook)) {
			throw new IllegalArgumentException("PhoneBook Class�� �����ϴ�.");
		}
			PhoneBook pb = (PhoneBook)objct;
			if(this.phone.equals(pb.phone)) {
				flag = true;
			}
			
		return flag;
	}
	//�������̵� : compareTo : �̸� name 
	@Override
	public int compareTo(Object obj) {
		int value = 0;
		if(!(obj instanceof PhoneBook)) {
			throw new IllegalArgumentException("PhoneBook Class�� �����ϴ�.");
		}
		PhoneBook pb = (PhoneBook)obj;	
		//���� "ABC" �� "ADC"�� ���ϸ� K�ϰ� L�� �� A(65)-A�� ���� 0 B(66)-D(68)�� -2  �̷������� �̸��� �񱳰� �����ϴ�.
		//�׷��⿡ compareTo(pb.name) ���ٸ������� �ȴ�.
		return this.name.compareTo(pb.name);
	}
	//�������̵� : toString
	@Override
	public String toString() {
		return " [name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", job=" + job
				+ "]";
	}
	
	//����, ����
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
