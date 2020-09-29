package java0925;

import java.util.ArrayList;
import java.util.Scanner;
//이름 비번 나이
public class UserDAO {

	ArrayList<UserVO> uservo ;
	public void userDAO() {
		uservo = new ArrayList<UserVO>();
	}
	public void join(Scanner scan) {
		UserVO user = new UserVO();
		System.out.println("id입력 : ");
		String userId = scan.next();
		
		System.out.println("비번입력 : ");
		String userPwd = scan.next();
		
		System.out.println("나이입력 : ");
		String userAge = scan.next();
		
		user.setUserId(userId);
		user.setUserPwd(userPwd);
		user.setAge(userAge);
		addUser(user);
	}
	private void addUser(UserVO user) {
		uservo.add(user);
	}
}