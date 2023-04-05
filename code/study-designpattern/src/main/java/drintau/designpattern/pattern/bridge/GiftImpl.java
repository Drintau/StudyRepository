package drintau.designpattern.pattern.bridge;

/**
 * 礼物的具体实现，例如：查看名称、说明书……
 */
public abstract class GiftImpl {

    String name;

    void showName(){
        System.out.println(name);
    }

    public GiftImpl(String name) {
        this.name = name;
    }
}
