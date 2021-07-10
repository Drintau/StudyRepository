package mjhct.designpattern.pattern.chainofresponsibility;

public class Filter2 implements Filter{

    private static final String name = "Filter2";

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setMsg(request.getMsg() + name);
        chain.doFilter(request, response);
        response.setMsg(response.getMsg() + name);
    }
}
