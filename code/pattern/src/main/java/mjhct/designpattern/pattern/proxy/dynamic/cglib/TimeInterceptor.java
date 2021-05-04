package mjhct.designpattern.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.Instant;

public class TimeInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(Instant.now());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(Instant.now());
        return result;
    }
}
