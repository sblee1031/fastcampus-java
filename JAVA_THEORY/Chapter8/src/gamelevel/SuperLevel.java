package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("�̳� ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump ");
	}

	@Override
	public void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****����� �����Դϴ�.");
	}
}
