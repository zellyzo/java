package test23;

public class Controller {
	
	public void callOrder(String order) {
		if ("1".equals(order)) {
			System.out.println("유저리스트 입니다.");
		} else if ("2".equals(order)) {
			System.out.println("생성할 유저명을 입력해주세요."); {
			}   
		} else if ("3".equals(order)) {
			System.out.println("수정할 유저명를 입력해주세요.");
		} else if ("4".equals(order)) {
			System.out.println("삭제할 유저명를 입력해주세요.");
		} else if ("q".equals(order)) {
			System.out.println("프로그램이 종료되었습니다.");
/*			System.exit(0);*/
		} else {
			System.out.println("존재하지 않는 명령어입니다.");
		}
	}
}