package java0914;
class MyDate4{   
  int year;    
  int month;    
  int day;  

  public MyDate4(){
    year=2016;    month=4;    day=1;
  }
 
  public MyDate4(int year,int month,int day){
   this.year=year;
   this.month=month;
   this.day=day;
  }
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate4 d=new MyDate4();	
    d.print();

    MyDate4 d2=new MyDate4(2017, 7, 19);
    d2.print();
  }
}            