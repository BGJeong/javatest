package java1005;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("입력");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			FileWriter fw = new FileWriter("./result.txt");
			boolean flag = true;
			while (flag) {
				if (br.readLine().equals("y")) {
					flag = false;
				} else {
					arr.add(br.readLine());
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				fw.write(arr.get(i));
			}
			fw.close();
			System.out.println("저장성공");
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
