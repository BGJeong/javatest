package java0923;

class Point2D3{
  protected int x=10;
  protected int y=20;
  
  public Point2D3( ){
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }
  
  public Point2D3(int xx, int yy){
  x=xx; y=yy;
  }
}
class Point3D3 extends Point2D3{
  protected int z=30;
  public void print( ){
  System.out.println(x+", "+y+", "+z);
  }
  public Point3D3(){
	  super(50, 60);
    System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}
class SuperTest06{
  public static void main(String[] args){
     Point3D3 pt=new Point3D3( );
    pt.print( );
    
  }
}