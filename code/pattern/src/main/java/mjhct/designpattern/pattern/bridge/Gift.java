package mjhct.designpattern.pattern.bridge;

/**
 * 抽象类：礼物
 * 有各种具有特殊含义的礼物：表达爱情的，表达节哀的，勉励的……
 */
public abstract class Gift {

    GiftImpl giftImpl;

    void showName() {
        giftImpl.showName();
    }

    public Gift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
