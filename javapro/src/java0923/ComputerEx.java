package java0923;

class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 90;

		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		System.out.println();

		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));
	}

}
