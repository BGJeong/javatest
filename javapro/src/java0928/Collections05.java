package java0928;

import java.util.*;

class Collections05 {
  public static void main(String[] args) {

    Vector<String> vec = new Vector<String>();
	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");

	String temp;
    for(int i=0; i<vec.size(); i++){
		temp=vec.get(i); //다운 캐스팅
//		temp=vec.get(i);
		System.out.println(vec.get(i));
		System.out.println(temp.toUpperCase());
	}    
  } 
}                                                                                           
