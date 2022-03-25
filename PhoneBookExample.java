package com.mire.phone_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBookExample {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean stopFlag = false;
		ArrayList<PhoneBook> al = new ArrayList<PhoneBook>();
		
		//삽입, 수정, 삭제, 정렬, 출력
		while(!stopFlag) {
			System.out.println("1번 삽입, 2번 수정, 3번 삭제, 4번 정렬(오름), 5번 정렬(내림) 6번 출력, 7번 종료");
			System.out.print(">>");
			int no = scan.nextInt();
			
			switch(no) {
			case 1: insertPhoneBook(al); System.out.println("입력 완료"); break;
			case 2: updatePhoneBook(al); break;
			case 3: deletePhoneBook(al); break;
			case 4: sortPhoneBook(al);   break;
			case 5: sortPhoneBookDec(al);   break;
			case 6: printPhoneBook(al);  break;
			case 7: stopFlag= true; break;
			default: System.out.println("생각하세요."); 
			}
		}
		System.out.println("종료!!!");
	}

	private static void insertPhoneBook(ArrayList<PhoneBook> al) {
		al.add(new PhoneBook("홍길동1", "남자", 20, "010-2971-4006", "웹개발자" ));
		al.add(new PhoneBook("홍길동2", "남자", 22, "010-2971-4007", "웹개발자" ));
		al.add(new PhoneBook("홍길동3", "남자", 24, "010-2971-4008", "웹개발자" ));
		al.add(new PhoneBook("홍길동4", "남자", 26, "010-2971-4009", "웹개발자" ));
		al.add(new PhoneBook("홍길동5", "남자", 28, "010-2971-4010", "웹개발자" ));
	}
	private static void printPhoneBook(ArrayList<PhoneBook> al) {
		for(PhoneBook data: al) {
			System.out.println(data);
		}
	}
	
	private static void updatePhoneBook(ArrayList<PhoneBook> al) {
	 System.out.print("수정할 전화번호부 >>");
	 scan.nextLine();
	 String phone = scan.nextLine();
	 PhoneBook searchPhoneBook = null;
	 
	 for(PhoneBook data: al) {
		 if(data.getPhone().equals(phone)) {
			 //searchPhoneBook에다가 data를 저장한다.
			 searchPhoneBook = data;
			 break;
		 }
	 }
	 	if(searchPhoneBook == null) {
	 		System.out.println(phone +"찾는 번호가 없습니다.");
	 		return;
	 	}
	 
	 	System.out.println(searchPhoneBook);
	 	System.out.print(searchPhoneBook.getJob() +"수정할 직업을 작성하세요 >>");
	 	String job = scan.nextLine();
	 	//searchPhoneBook에 수정한 직업을 집어넣는다.
	 	searchPhoneBook.setJob(job);
	 	System.out.println("수정완료했습니다.");
	}
	

	private static void sortPhoneBook(ArrayList<PhoneBook> al) {
		Collections.sort(al);
	}
	
	private static void sortPhoneBookDec(ArrayList<PhoneBook> al) {
		//똑같이하되 괄호안에 Collections.reverseOrder()을 넣어주면 내림차순이된다.
		Collections.sort(al, Collections.reverseOrder());
		
	}
	
	private static void deletePhoneBook(ArrayList<PhoneBook> al) {
		boolean deleteFlag = false;
		System.out.print("삭제할 전화번호부 >>");
		 scan.nextLine();
		 String phone = scan.nextLine();
		
		 for(PhoneBook data: al) {
			 if(data.getPhone().equals(phone)) {
				 al.remove(data);
				 System.out.println(phone + "전화번호 삭제성공");
				 //제거가 됐으면 
				 deleteFlag = true;
				 break;
			 }
		 }
		 if(deleteFlag == false) {
			 System.out.println("삭제할 번호"+phone + "없습니다.");
		 }
		 
	}
	

}
