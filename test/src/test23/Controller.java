package test23;

public class Controller {
	
	public void callOrder(String order) {
		if ("1".equals(order)) {
			System.out.println("��������Ʈ �Դϴ�.");
		} else if ("2".equals(order)) {
			System.out.println("������ �������� �Է����ּ���."); {
			}   
		} else if ("3".equals(order)) {
			System.out.println("������ ������ �Է����ּ���.");
		} else if ("4".equals(order)) {
			System.out.println("������ ������ �Է����ּ���.");
		} else if ("q".equals(order)) {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
/*			System.exit(0);*/
		} else {
			System.out.println("�������� �ʴ� ��ɾ��Դϴ�.");
		}
	}
}