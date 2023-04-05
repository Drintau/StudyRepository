package drintau.designpattern.pattern.flyweight;

public class Test {

    public static void main(String[] args) {
        // JDK示例
//        String a = "abc";
//        String b = "abc";
//        System.out.println(a == b);
//
//        Integer c = Integer.valueOf(127);
//        Integer d = Integer.valueOf(127);
//        System.out.println(c == d);

        QiZiFactory qiZiFactory = new QiZiFactory();

        // 白黑互相落子
        for (int i=0; i<10; i++) {
            WhiteQiZi baiZi = qiZiFactory.getBaiZi();
            baiZi.luoZi(i, i+1);
            BlackQiZi heiZi = qiZiFactory.getHeiZi();
            heiZi.luoZi(i+1, i);
            if (i % 5 ==0) {
                // 用完回收
                baiZi.beEaten();
            }
        }

        // 回收继续使用
        qiZiFactory.getBaiZi().luoZi(0, 0);

        // 没有可使用对象
        qiZiFactory.getHeiZi().luoZi(0, 0);

    }

}
