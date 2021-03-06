package java0914;

import java.util.Scanner;

class MemberInfo4 {
	private String name;
	private int age;
	private String email;
	private String addr;

	public MemberInfo4(String name, int age, String email, String addr) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
	}
	

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getEmail() {
		return email;
	}


	public String getAddr() {
		return addr;
	}

}

public class MemberInput4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("몇명의 정보를 입력하시겠습니까");
		Scanner scan = new Scanner(System.in);
		int many = scan.nextInt();
		String name, addr, email;
		int age;
		scan.nextLine();
		MemberInfo4[] m = new MemberInfo4[many];
		for (int i = 0; i < many; i++) {
			System.out.println(i+1+"번째 회원의 정보입니다.");
			System.out.print("이름을 입력하세요");
			name = scan.nextLine();
			if (name.equals("") || name.equals(null)) {
				System.err.println("이름을 공백없이 다시 입력해주세요");
				name = scan.nextLine();
			}
			System.out.print("나이를 입력하세요");
			age = scan.nextInt();
			scan.nextLine();
			System.out.print("e-mail을 입력하세요");
			email = scan.nextLine();
			if (email.equals("") || email.equals(null)) {
				System.err.println("e-mail을 공백없이 다시 입력해주세요");
				email = scan.nextLine();
			}
			System.out.print("주소를 입력하세요");
			addr = scan.nextLine();
			if (addr.equals("") || addr.equals(null)) {
				System.err.println("주소를 공백없이 다시 입력해주세요");
				addr = scan.nextLine();
			}
			m[i] = new MemberInfo4(name, age, email, addr);
		}
		scan.close();
		for(int j = 0; j<many; j++) {
			System.out.println(j+1+"번째 회원 정보 ");
			System.out.println("이름은 : "+m[j].getName());
			System.out.println("냐이는 : "+m[j].getAge());
			System.out.println("이메일은 : "+m[j].getEmail());
			System.out.println("주소는 : "+m[j].getAddr());
			System.out.println();
		}
	}

}
