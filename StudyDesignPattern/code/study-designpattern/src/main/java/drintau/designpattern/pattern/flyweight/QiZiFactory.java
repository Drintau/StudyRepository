package drintau.designpattern.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 围棋棋子工厂
 */
public class QiZiFactory {

    private static List<BlackQiZi> blackQiZiList = new ArrayList<>(16);

    private static List<WhiteQiZi> whiteQiZiList = new ArrayList<>(16);

    static {
        // 假设棋盘最多容纳10个棋子，那么黑白棋子最多10个
        for (int i=0; i<10; i++) {
            blackQiZiList.add(new BlackQiZi());
            whiteQiZiList.add(new WhiteQiZi());
        }
    }

    BlackQiZi getHeiZi() {
        for (BlackQiZi blackQiZi : blackQiZiList) {
            if (!blackQiZi.isUse()) {
                return blackQiZi;
            }
        }
        // 在这里这是不可能发生的事情，抛出异常
        System.out.println("黑子用完，不可能");
        return null;
    }

    WhiteQiZi getBaiZi() {
        for (WhiteQiZi whiteQiZi : whiteQiZiList) {
            if (!whiteQiZi.isUse()) {
                return whiteQiZi;
            }
        }
        // 在这里这是不可能发生的事情，抛出异常
        System.out.println("白子用完，不可能");
        return null;
    }

}
