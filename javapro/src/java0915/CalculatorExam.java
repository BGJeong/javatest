package java0915;

class Calculator1 {
	int plus(int x, int y) {
		int sum = x + y;
		return sum;
	}
	double avg(int x, int y) {
		double result = plus(x,y);
		double average = result/2;
		return average;
	}
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : "+result);
	}
	void println(String msg) {
		System.out.println(msg);
	}
}

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 cal = new Calculator1();
		cal.execute();
	}

}
