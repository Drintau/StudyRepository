package mjhct.designpattern.pattern.proxy.dynamic.jdk;

public class Bird implements FlyAble {
    @Override
    public void fly() {
        System.out.println("鸟飞");
    }
}
