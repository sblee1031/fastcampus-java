package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("===");
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		System.out.println("===");
		

		ArrayList<String> set_a = new ArrayList<String>();
		
		set_a.add("�̼���");
		set_a.add("������");
		set_a.add("������");
		set_a.add("�̼���");
		
		for (String string : set_a) {
			System.out.println("ArrayList"+string);
		}
		
		//System.out.println(set_a);
	}

}
