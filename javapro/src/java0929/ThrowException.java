package java0929;

public class ThrowException {

	public void exceptionMethod() throws Exception {
		// 배열 선언
		int[] intA = { 1, 2, 3, 4,5,6,7,8,9,10,11 };

		// 배열의 저장된 값을 출력
		for (int i = 0; i < 10; i++) {
			// 예외를 던짐(프로그래머가 예외를 발생시킴)
			if (i == intA.length)
				throw new Exception();
			System.out.println(intA[i]);
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();

		try {
			te.exceptionMethod();
		} catch (Exception ab) {
			System.out.println("배열의 index를 초과했습니다.");
			ab.printStackTrace();
		}

	}// main() end
}