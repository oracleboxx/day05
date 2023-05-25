package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class array_test_set {

	public static void main(String[] args) {
		/*set -> hashset
		 * - 순서를 유지하지 않는다.
		 * - index를 사용할 수 없다
		 * -index대신에 iterator를 사용한다
		 * - 기본 배열의 크기를 16개 만들어 놓고 시작한다.
		 *   데이터를 저장하다 75%가 채워지면 이어서 16개의 공가을 늘린다
		 *   -데이터의 중복을 하용하지 않는다
		 *   -list보다 처리속도가 빠르다 
		 */
		HashSet<String> hs =new HashSet<>();
		ArrayList<String> arr = new ArrayList<>();
		hs.add("김밥");hs.add("라면");hs.add("순대");hs.add("김밥");
		
		arr.add("라면");arr.add("김밥");arr.add("김밥");arr.add("순대");
		System.out.println(hs);
		System.out.println(arr);
		hs.remove("순대");
		System.out.println(hs);
	}	

}
