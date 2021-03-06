package java0915;

class Computer{
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		int[] a = {1,2,3};
		int result1 = com.sum1(a);
		System.out.println(result1);
		
		int result2= com.sum1(new int[]{1,2,3,4,5});
		System.out.println(result2);
	}

}
