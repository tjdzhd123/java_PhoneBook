package com.mire.phone_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBookExample {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean stopFlag = false;
		ArrayList<PhoneBook> al = new ArrayList<PhoneBook>();
		
		//����, ����, ����, ����, ���
		while(!stopFlag) {
			System.out.println("1�� ����, 2�� ����, 3�� ����, 4�� ����(����), 5�� ����(����) 6�� ���, 7�� ����");
			System.out.print(">>");
			int no = scan.nextInt();
			
			switch(no) {
			case 1: insertPhoneBook(al); System.out.println("�Է� �Ϸ�"); break;
			case 2: updatePhoneBook(al); break;
			case 3: deletePhoneBook(al); break;
			case 4: sortPhoneBook(al);   break;
			case 5: sortPhoneBookDec(al);   break;
			case 6: printPhoneBook(al);  break;
			case 7: stopFlag= true; break;
			default: System.out.println("�����ϼ���."); 
			}
		}
		System.out.println("����!!!");
	}

	private static void insertPhoneBook(ArrayList<PhoneBook> al) {
		al.add(new PhoneBook("ȫ�浿1", "����", 20, "010-2971-4006", "��������" ));
		al.add(new PhoneBook("ȫ�浿2", "����", 22, "010-2971-4007", "��������" ));
		al.add(new PhoneBook("ȫ�浿3", "����", 24, "010-2971-4008", "��������" ));
		al.add(new PhoneBook("ȫ�浿4", "����", 26, "010-2971-4009", "��������" ));
		al.add(new PhoneBook("ȫ�浿5", "����", 28, "010-2971-4010", "��������" ));
	}
	private static void printPhoneBook(ArrayList<PhoneBook> al) {
		for(PhoneBook data: al) {
			System.out.println(data);
		}
	}
	
	private static void updatePhoneBook(ArrayList<PhoneBook> al) {
	 System.out.print("������ ��ȭ��ȣ�� >>");
	 scan.nextLine();
	 String phone = scan.nextLine();
	 PhoneBook searchPhoneBook = null;
	 
	 for(PhoneBook data: al) {
		 if(data.getPhone().equals(phone)) {
			 //searchPhoneBook���ٰ� data�� �����Ѵ�.
			 searchPhoneBook = data;
			 break;
		 }
	 }
	 	if(searchPhoneBook == null) {
	 		System.out.println(phone +"ã�� ��ȣ�� �����ϴ�.");
	 		return;
	 	}
	 
	 	System.out.println(searchPhoneBook);
	 	System.out.print(searchPhoneBook.getJob() +"������ ������ �ۼ��ϼ��� >>");
	 	String job = scan.nextLine();
	 	//searchPhoneBook�� ������ ������ ����ִ´�.
	 	searchPhoneBook.setJob(job);
	 	System.out.println("�����Ϸ��߽��ϴ�.");
	}
	

	private static void sortPhoneBook(ArrayList<PhoneBook> al) {
		Collections.sort(al);
	}
	
	private static void sortPhoneBookDec(ArrayList<PhoneBook> al) {
		//�Ȱ����ϵ� ��ȣ�ȿ� Collections.reverseOrder()�� �־��ָ� ���������̵ȴ�.
		Collections.sort(al, Collections.reverseOrder());
		
	}
	
	private static void deletePhoneBook(ArrayList<PhoneBook> al) {
		boolean deleteFlag = false;
		System.out.print("������ ��ȭ��ȣ�� >>");
		 scan.nextLine();
		 String phone = scan.nextLine();
		
		 for(PhoneBook data: al) {
			 if(data.getPhone().equals(phone)) {
				 al.remove(data);
				 System.out.println(phone + "��ȭ��ȣ ��������");
				 //���Ű� ������ 
				 deleteFlag = true;
				 break;
			 }
		 }
		 if(deleteFlag == false) {
			 System.out.println("������ ��ȣ"+phone + "�����ϴ�.");
		 }
		 
	}
	

}
