package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for (String string : treeSet) {
			System.out.println(string);
		}

	}

}
