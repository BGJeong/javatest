package java0914;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class MemberInfo5 {
	private String name;
	private int age;
	private String email;
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

public class MemberInput5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberInfo5> list = new ArrayList<MemberInfo5>();
		Scanner scan = new Scanner(System.in);
		String name, addr, email;
		int age;
		while (true) {
			try {
				System.out.print("나이를 입력하세요");
				age = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("정수만 입력 가능합니다.");
				scan = new Scanner(System.in);
				continue;
			}
			System.out.print("이름을 입력하세요");
			name = scan.nextLine();
			while (name.equals("") || name.equals(null)) {
				System.err.print("이름을 공백없이 다시 입력해주세요");
				name = scan.nextLine();
			}

			System.out.print("e-mail을 입력하세요");
			email = scan.nextLine();
			while (email.equals("") || email.equals(null)) {
				System.err.print("e-mail을 공백없이 다시 입력해주세요");
				email = scan.nextLine();
			}
			System.out.print("주소를 입력하세요");
			addr = scan.nextLine();
			while (addr.equals("") || addr.equals(null)) {
				System.err.print("주소를 공백없이 다시 입력해주세요");
				addr = scan.nextLine();
			}
			System.out.println();
			MemberInfo5 mem = new MemberInfo5();
			mem.setName(name);
			mem.setAge(age);
			mem.setEmail(email);
			mem.setAddr(addr);
			list.add(mem);
			System.out.println("입력한 값을 확인하려면 n(N)을 누르세요.");
			System.out.println("계속 입력하려면 아무키나 누르세요");
			String sc = scan.nextLine();
			if (sc.equals("n") || sc.equals("N")) {
				for (MemberInfo5 i : list) {
					System.out.println("이름 : " + i.getName());
					System.out.println("나이 : " + i.getAge());
					System.out.println("메일 : " + i.getEmail());
					System.out.println("주소 : " + i.getAddr());
					System.out.println();
				}
				break;
			}
		}
	}
}
