package day05;

import java.util.ArrayList;

public class array_Test {

	public static void main(String[] args) {
		//컬렉션 프레임워크(colection framework)
		//- 데이터들을 편리하게 사용할 수 있게 만든 기능
		//- 펴준화된 클래스를 이용한다
		/*collection
			- 다수의 데이터들을 의미한다
			- 무한한 데이터의 집함
		freamework
			- 디자인 패턴
			- 펴준화된 프로그래밍 방식
			컬렉션 프레임웍의 핵심 인터페이스
			- List, set ,map
			list => arrayList
			- 순서가 있는 데이터의 집합
			- 순서가 존재해서 index를 사용할 수 있다
			- 데이터의 중복이 가능하다
			*/
		 ArrayList<String> arrList = new ArrayList<String>();
		 
	
		 arrList.add("하나");
		 arrList.add("둘");
		 arrList.add("셋");
		 arrList.add("넷");
		 for(int i =0; i<arrList.size(); i++) {
			 System.out.println(arrList.get(i)+"\n");
		 }
		 System.out.println(arrList.get(0));
		 System.out.println(arrList.contains("하나"));
		 System.out.println(arrList.contains("둘"));
		 
		 
		 System.out.println("========arr ====");
		 System.out.println(arrList);
		 arrList.remove(0);
		 System.out.println("하나 삭제"+arrList);
		 System.out.println("첫번 째:\t"+arrList.get(0));
		 
		 
}


}
