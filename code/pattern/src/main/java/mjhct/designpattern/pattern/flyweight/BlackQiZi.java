package mjhct.designpattern.pattern.flyweight;

public class BlackQiZi extends QiZi{

    private static final String COLOR = "黑色";

    @Override
    void luoZi(int x, int y) {
        System.out.println("落子：" + COLOR + "(" + x + "," + y + ")");
        setUse(true);

        // 计算是否有白子被吃
    }
}
