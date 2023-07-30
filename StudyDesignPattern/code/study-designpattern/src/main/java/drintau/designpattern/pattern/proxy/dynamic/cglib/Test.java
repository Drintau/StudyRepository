package drintau.designpattern.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib动态代理
 */
public class Test {

    public static void main(String[] args) {
        Enhancer flyTimeProxy = new Enhancer();
        flyTimeProxy.setSuperclass(Bird.class);
        flyTimeProxy.setCallback(new TimeInterceptor());
        Bird birdProxy = (Bird) flyTimeProxy.create();
        birdProxy.fly();

        flyTimeProxy.setSuperclass(Plane.class);
        Plane planeProxy = (Plane) flyTimeProxy.create();
        planeProxy.fly();
    }

}
