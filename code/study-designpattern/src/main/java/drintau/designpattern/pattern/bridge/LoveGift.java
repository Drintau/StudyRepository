package drintau.designpattern.pattern.bridge;

/**
 * 表达爱情的礼物
 */
public class LoveGift extends Gift{
    public LoveGift(GiftImpl giftImpl) {
        super(giftImpl);
        giftImpl.name += "--爱情礼物";
    }
}
