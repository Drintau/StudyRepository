package drintau.designpattern.pattern.flyweight;

/**
 * 围棋棋子
 */
public abstract class QiZi {

    private boolean use;

    /**
     * 落子，use要置为true
     */
    abstract void luoZi(int x, int y);

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    /**
     * 被围住吃了，use要置为false
     */
    public void beEaten() {
        use = false;
    }

}
