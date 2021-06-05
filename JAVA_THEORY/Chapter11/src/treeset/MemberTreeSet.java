package treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>(new Member());
	}
	public void addMember(Member member) {
		treeset.add(member);
	}
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir =  treeset.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeset.remove(member);
				System.out.println("�̸� : "+member.getMemberName()+" �� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
