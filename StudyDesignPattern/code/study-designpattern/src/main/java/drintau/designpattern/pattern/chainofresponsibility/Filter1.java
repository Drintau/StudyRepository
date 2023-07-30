package drintau.designpattern.pattern.chainofresponsibility;

import java.util.Random;

public class Filter1 implements Filter{

    private static final String name = "Filter1";

    Random r = new Random();

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setMsg(request.getMsg() + name);
        if (r.nextInt(10) > 5) {
            chain.doFilter(request, response);
        }
        response.setMsg(response.getMsg() + name);
    }
}
