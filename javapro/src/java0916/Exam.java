package java0916;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length -i-1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = 0;
					temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}
}
