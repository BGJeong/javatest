package java0915;

class Calculator {
	
	void powerOn() {
		System.out.println("----시작----");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double devide(int x, int y) {
		double result = x / y;
		return result;
	}
	void powerOff() {
		System.out.println("----종료----");
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(1, 2);
		System.out.println(result1);
		
		double result2 = cal.devide(3, 2);
		System.out.println(result2);
		
		cal.powerOff();
	}

}
