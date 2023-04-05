package drintau.designpattern.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Instant;

public class TimeInvocationHandler implements InvocationHandler {

    private Object target;

    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(Instant.now());
        Object invoke = method.invoke(target, args);
        System.out.println(Instant.now());
        return invoke;
    }
}
