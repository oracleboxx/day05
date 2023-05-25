package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class array_test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name =new ArrayList<String>();
		ArrayList<String> phone =new ArrayList<String>();
	
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			int num =sc.nextInt();
			
			switch(num) {
			case 1:
					
						System.out.println("연락처와 이름 적어주세요");
						String inputNum =sc.next();
					
						String inputName =sc.next();
						
						if(!phone.contains(inputNum) ){ // contains : ture false 값으로 변환 
							    phone.add(inputNum);
							    name.add(inputName);
							System.out.println("등록");
						}
						else if(phone.contains(inputNum) ){
							System.out.println("저장실패");
						
						}
						
					
					
					
					break;
			case 2: 
				System.out.println("검색하세요");
					String serch = sc.next();
			
					if(phone.contains(serch)) {
						int index = phone.indexOf(serch);
						System.out.println(name.get(index));
						System.out.println(phone.get(index));
					}
					else {
						System.out.println("등록안됨");
					}
					break;
			case 3: System.out.println("삭제 하세요");
					String serch1 = sc.next();
					if(phone.contains(serch1)) {
						int index = phone.indexOf(serch1);
						phone.remove(index);
						name.remove(index);
						
					}
					else {
						System.out.println("삭제 못함");
					}
					
					
			
					break;
			case 4:
					for(int i =0; i<phone.size(); i++) {
						System.out.println(phone.get(i));
						System.out.println(name.get(i));
					}
					break;
			case 5: 
					return;
			
			}
		}
	}

}
