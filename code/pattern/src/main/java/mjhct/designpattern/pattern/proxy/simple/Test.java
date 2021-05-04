package mjhct.designpattern.pattern.proxy.simple;

/**
 * 静态代理，也就是简单的代理模式实现
 */
public class Test {
    public static void main(String[] args) {
        FlyAble f = new FlyAbleProxy(new Bird());
        f.fly();
    }
}

interface FlyAble {
    void fly();
}

class Bird implements FlyAble {

    @Override
    public void fly() {
        System.out.println("鸟飞");
    }
}

class FlyAbleProxy implements FlyAble {

    private FlyAble f;

    public FlyAbleProxy(FlyAble f) {
        this.f = f;
    }

    @Override
    public void fly() {
        System.out.println("飞之前的时间");
        f.fly();
        System.out.println("飞之后的时间");
    }
}
