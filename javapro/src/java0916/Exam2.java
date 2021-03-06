package java0916;

import java.text.DecimalFormat;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 5;
		DecimalFormat df = new DecimalFormat("0.##");
				
		double pi = Math.PI;
		
		double circum = 2*pi*r;
		double area = pi*r*r;
		double sphere = 4 * pi * Math.pow(r,2);
		double sphereArea = (double)4/3 * pi * (Math.pow(r, 3));
		
		System.out.println("원주(원둘레) : "+df.format(circum));
		System.out.println("원의 면적 : "+df.format(area));
		System.out.println("구의 표면적 : "+df.format(sphere));
		System.out.println("구의 체적(부피) : "+df.format(sphereArea));
	}
}
