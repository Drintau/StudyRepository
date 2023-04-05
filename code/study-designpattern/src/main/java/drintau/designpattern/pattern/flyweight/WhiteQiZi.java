package drintau.designpattern.pattern.flyweight;

public class WhiteQiZi extends QiZi{

    private static final String COLOR = "白色";

    @Override
    void luoZi(int x, int y) {
        System.out.println("落子：" + COLOR + "(" + x + "," + y + ")");
        setUse(true);

        // 计算是否有黑子被吃
    }
}
