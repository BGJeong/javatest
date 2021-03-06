package java1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		while (true) {
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("출력할 구구단의 단수를 입력하세요");
			try {
				int a = Integer.parseInt(br.readLine());
				System.out.println(a + " 단");
				for (int i = 1; i <= 9; i++) {
					System.out.println(a + " X " + i + " = " + i * a);
				}
				break;
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				System.out.println("숫자만 입력");
			}

		}
	}
}
