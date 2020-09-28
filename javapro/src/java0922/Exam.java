package java0922;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("윤년을 판별할 연도를 입력하세요");
				Scanner scan = new Scanner(System.in);
				GregorianCalendar gc = new GregorianCalendar();
				int year = scan.nextInt();
				scan.nextLine();
				if (gc.isLeapYear(year)) {
					System.out.println(year + "은(는) 윤년입니다.");
					break;
				} else {
					System.out.println(year + "은(는) 윤년이 아닙니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
			}
		}
	}
}
