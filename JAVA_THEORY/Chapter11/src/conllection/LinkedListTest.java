package conllection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("c");
		
		System.out.println(myList);
		myList.add(1,"d");
		
		System.out.println(myList);
		myList.removeLast();
		System.out.println(myList);
		
		for (int i = 0; i < myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}

}
