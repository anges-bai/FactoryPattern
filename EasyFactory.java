import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/9 16:44
 * @Description:
 * 简单工厂模式：专门定义一个类用来创建其它类的实例，被创建的实例通常都具有共同的父类。
 * 1. 一个抽象产品类
 * 2. 具体产品类
 * 3. 一个工厂
 */
interface A{
    void print();
}
class a1 implements A{
    @Override
    public void print() {
        System.out.println("this is a1");
    }
}
class a2 implements A{
    @Override
    public void print() {
        System.out.println("this is a2");
    }
}
class Factory{
    public static A getInstance(String type){
        A a=null;
        if (type.equals("a1")){
            a=new a1();
        }
        else if (type.equals("a2")){
            a=new a2();
        }
        return a;
    }
}
class Client{
    public void buy(A a){
        a.print();
    }
}
public class EasyFactory {
    public static void main(String[] args) {
      Client client=new Client();
        Scanner scanner=new Scanner(System.in);
        String type=scanner.nextLine();
        A a=Factory.getInstance(type);
        client.buy(a);
    }
}
