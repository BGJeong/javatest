package java0922;

class Point2{
  protected int x=10;     //  private int x=10;
}
class Point3 extends Point2{
  protected int z=30;
  public void print(int y){
    System.out.println(  x  +", "+y+","+z);   
  }
}

class SuperSub04{
  public static void main(String[] args){
    Point3 pt=new Point3( );
    pt.print(3);
  }
}