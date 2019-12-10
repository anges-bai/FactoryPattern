/**
 * @Author: BaiMiao
 * @Date: 2019/12/9 17:24
 * @Description:
 * 工厂方法模式：定义一个用来创建对象的接口，让子类决定实例化哪一个类，让子类决定实例化延迟到子类。
 * 工厂方法模式是针对每个产品提供一个工厂类，在客户端中判断使用哪个工厂类去创建对象。
 * 我们将之前的 Factory 抽象成一个接口，那么创建相应具体的工厂类去实现该接口的方法。
 * A---a1,a2   Factory---a1_Factory,a2_Factory
 * 1. 一个抽象产品类
 * 2. 多个具体产品类
 * 3. 一个抽象工厂
 * 4. 多个具体工厂 - 每一个具体产品对应一个具体工厂
 */
interface B{
    void print();
}
class b1 implements B{
    @Override
    public void print() {
        System.out.println("this is b1");
    }
}
class b2 implements B{
    @Override
    public void print() {
        System.out.println("this is b2");
    }
}
interface factoryB{
    B create();
}
class factory_b1 implements factoryB{
    @Override
    public B create() {
        return new b1();
    }
}
class factory_b2 implements factoryB{
    @Override
    public B create() {
        return new b2();
    }
}
class Client_b{
    public void buy(B b){
        b.print();
    }
}
public class FactoryMethods {
    public static void main(String[] args) {
        Client_b c1=new Client_b();
        factoryB factoryB=new factory_b1();
        c1.buy(factoryB.create());
    }
}
