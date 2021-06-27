package mjhct.designpattern.pattern.bridge;

/**
 * 鼓励型礼物
 */
public class EncourageGift extends Gift{
    public EncourageGift(GiftImpl giftImpl) {
        super(giftImpl);
        giftImpl.name += "--励志礼物";
    }
}
