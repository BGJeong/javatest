package java0925;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		UserDAO userdao = new UserDAO();
		while( flag ) {
			System.out.println("메뉴를 고르세요");
			System.out.println("1. 회원가입 ");
			System.out.println("2. 로그인");
			System.out.println("3. 전체회원 확인");
			System.out.println("4. 종료");
			
			String menu = scan.next();
			switch(menu) {
			case "1" : userdao.join(scan);
				break;
			case "2" : //로그인
				break;
			case "3" : //전체확인
				break;
			case "4" : flag = false;
			}
		}
	}
}
