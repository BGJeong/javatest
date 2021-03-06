package java0924;

interface IHello04{
  public abstract void sayHello(String name);
}
abstract class GoodBye04{
  public abstract void sayGoodBye(String name);
}

class SubClass04 extends GoodBye04 implements IHello04{
  public void sayHello(String name){
    System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
    System.out.println(name+"씨 안녕히 가세요!");
  }
}
class AbstractTest04{
  public static void main(String[] args) {
    SubClass04 test= new SubClass04();
    test.sayHello(args[0]);
    test.sayGoodBye(args[0]);
  }   
}                          