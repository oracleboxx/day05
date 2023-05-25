package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class array_test_set2 {

	public static void main(String[] args) {
		ArrayList<String> arr =new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		System.out.println(arr);
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}System.out.println(it.hasNext()+"");
		/*
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		
		*/
		HashSet<String> hs =new HashSet<>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		Iterator<String> i = hs.iterator();
	while(i.hasNext()) {
		String h = i.next();
		System.out.println(h);
	}
		
	}

}
