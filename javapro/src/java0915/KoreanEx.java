package java0915;

class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}
public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바", "0000");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("김자바","1111");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
