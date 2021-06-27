package mjhct.designpattern.pattern.bridge;

public class Test {

    public static void main(String[] args) {
        System.out.println("赠送礼物");
        Gift g = new LoveGift(new Book("言情小说"));
        g.showName();
        g = new EncourageGift(new Book("钢铁是如何炼成的"));
        g.showName();
    }

}
