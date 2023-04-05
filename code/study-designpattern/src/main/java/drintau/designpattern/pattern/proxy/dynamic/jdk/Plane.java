package drintau.designpattern.pattern.proxy.dynamic.jdk;

public class Plane implements FlyAble{
    @Override
    public void fly() {
        System.out.println("飞机飞");
    }
}
