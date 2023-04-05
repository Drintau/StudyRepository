package drintau.designpattern.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class Test {

    public static void main(String[] args) {
        FlyAble flyTimeProxy = (FlyAble) Proxy.newProxyInstance(Bird.class.getClassLoader(), new Class[]{FlyAble.class}, new TimeInvocationHandler(new Bird()));
        flyTimeProxy.fly();

        flyTimeProxy = (FlyAble) Proxy.newProxyInstance(Bird.class.getClassLoader(), new Class[]{FlyAble.class}, new TimeInvocationHandler(new Plane()));
        flyTimeProxy.fly();
    }

}
