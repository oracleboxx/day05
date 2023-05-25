package day05;

import java.util.ArrayList;

public class array_test3 {

	public static void main(String[] args) {
		ArrayList<String> arr =new ArrayList<String>();
		
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		System.out.println(arr);
		for(int i=0;i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		for(String x : arr) {
			System.out.println(x);
		}
	}

}
