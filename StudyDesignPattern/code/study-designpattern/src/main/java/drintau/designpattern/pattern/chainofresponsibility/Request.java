package drintau.designpattern.pattern.chainofresponsibility;

public class Request {

    String msg;

    public Request(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
