package java0914;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInfo3 {
	private String[] name;
	private int[] age;
	private String[] email;
	private String[] addr;

	public MemberInfo3(String[] name, int[] age, String[] email, String[] addr) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int[] getAge() {
		return age;
	}

	public void setAge(int[] age) {
		this.age = age;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getAddr() {
		return addr;
	}

	public void setAddr(String[] addr) {
		this.addr = addr;
	}

	public void print() {
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"번째 회원의 이름은 "+name[i]+", 나이는 "+age[i]+", e-mail은 "+email[i]+", 주소는 "+addr[i]+"입니다.");
		}
	}
}

public class MemberInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberInfo3> list = new ArrayList<MemberInfo3>();
		for(int i=0; i<list.size(); i++) {
			list.get(i).getName();
		}
		System.out.println(list.get(0).getName());
		System.out.println("몇명의 정보를 입력하시겠습니까");
		Scanner scan = new Scanner(System.in);
		int many = scan.nextInt();
		scan.nextLine();
		String[] name = new String[many];
		int[] age = new int[many];
		String[] email = new String[many];
		String[] addr = new String[many];
		for (int i = 0; i < many; i++) {
			System.out.println(i+1+"번째 회원의 정보입니다.");
			System.out.println("이름을 입력하세요");
			name[i] = scan.nextLine();
			if (name[i].equals("") || name[i].equals(null)) {
				System.err.println("이름을 공백없이 다시 입력해주세요");
				name[i] = scan.nextLine();
			}
			System.out.println("나이를 입력하세요");
			age[i] = scan.nextInt();
			scan.nextLine();
			System.out.println("e-mail을 입력하세요");
			email[i] = scan.nextLine();
			if (email[i].equals("") || email[i].equals(null)) {
				System.err.println("e-mail을 공백없이 다시 입력해주세요");
				email[i] = scan.nextLine();
			}
			System.out.println("주소를 입력하세요");
			addr[i] = scan.nextLine();
			if (addr[i].equals("") || addr[i].equals(null)) {
				System.err.println("주소를 공백없이 다시 입력해주세요");
				addr[i] = scan.nextLine();
			}
		}
		scan.close();
		MemberInfo3 member = new MemberInfo3(name, age, email, addr);
		member.print();

	}

}
