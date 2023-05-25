package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class array__Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		int num =0;
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.수정");
			System.out.println("6.종료");
			num = input.nextInt();
			switch(num) {
			case 1: System.out.println("이름과 전화번호 등록하세요");
					String inputname = input.next();
					String inputphone = input.next();
					if(!name.contains(inputname)) {
						name.add(inputname);
						phone.add(inputphone);
						System.out.println("등록하겠다");
						
					}
					else if(name.contains(inputname)) {
						System.out.println("등록이 중복이다");
					}
					break;
			case 2: 
					System.out.println("이름으로 검색 하기");
					inputname = input.next();
					if(name.contains(inputname)) {
						int dex = name.indexOf(inputname);
						System.out.println(name.get(dex));
						System.out.println(phone.get(dex));
						
					}
					else {
						System.out.println("검색 못했습니다");
					}
				break;
			case 3: 
					System.out.println("삭제하기");
					inputname = input.next();
					if(name.contains(inputname)) {
						int dex1 = name.indexOf(inputname);
						name.remove(dex1);
						phone.remove(dex1);
						
					}
					else {
						System.out.println("삭제 기능이 안켜졌습니다");
					}
					break;
			case 4: for(int i =0; i<name.size(); i++) {
					System.out.println(name.get(i));
					System.out.println(phone.get(i));
					
			}
					break;
			case 5:  
					System.out.println("수정을 해주세요");
					inputname = input.next();
					
					if(name.contains(inputname)) {
					String inputchange = input.next();  
						int dex2 = name.indexOf(inputname);
						
						name.set(dex2, inputchange);
						System.out.println(name.get(dex2));
					}
					else {
						System.out.println("수정 불가");
					}
				break;
			case 6:
					return;
			}
		}
	}

}
