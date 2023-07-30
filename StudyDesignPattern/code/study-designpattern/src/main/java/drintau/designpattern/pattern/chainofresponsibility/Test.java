package drintau.designpattern.pattern.chainofresponsibility;

/**
 * 责任链模式，模拟Java EE 的 FilterChain
 */
public class Test {

    public static void main(String[] args) {
        FilterChain fc = new FilterChain();
        Filter f1 = new Filter1();
        Filter f2 = new Filter2();
        fc.addFilter(f1).addFilter(f2);

        Request request = new Request("请求内容");
        Response response = new Response();

        fc.doFilter(request, response);

        System.out.println(request.getMsg());
        System.out.println(response.getMsg());
    }

}
