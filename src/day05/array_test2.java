package day05;
import java.util.ArrayList;
import java.util.Scanner;

public class array_test2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("감자");
		arr.add("고");
		arr.add("순");
		arr.add("김");
		System.out.println(arr);
		String name = input.next();
		int num = arr.indexOf(name);
		System.out.println(arr.indexOf(name)+"."+num);
		System.out.println(arr.contains(name));
		
		System.out.println("=========");
		System.out.println(arr);
		int index;
		System.out.println("변경할 위치 입력");
		index = input.nextInt();
		System.out.println("변경할 값 입력");
		name = input.next();
		System.out.println(arr.get(index)+"=>");
		arr.set(index, name);
		System.out.println(arr.get(index));
		System.out.println("변경 후 arr"+arr);
	}

}
