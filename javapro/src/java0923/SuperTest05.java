package java0923;

class Point2D2{
  protected int x=10;
  protected int y=20;
  public Point2D2( ){
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }
}
class Point3D2 extends Point2D2{
  protected int z=30;
  public void print( ){
  System.out.println(x+", "+y+","+z);
  }
  public Point3D2( ){
    System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}

class SuperTest05{
  public static void main(String[] args){
    Point3D2 pt=new Point3D2( );
    pt.print( );
  }
}