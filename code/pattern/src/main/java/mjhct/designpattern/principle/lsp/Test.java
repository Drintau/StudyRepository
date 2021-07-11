package mjhct.designpattern.principle.lsp;

/**
 * 里氏替换原则 反例：正方形非长方形
 */
public class Test {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
//        Rectangle r = new Square(); 用正方形替换长方形，死循环；业务结果被改变了；此时“正方形非长方形”
        r.setLength(20);
        r.setWidth(16);

        /**
         * 变形：长方形的宽变得比长多1
         */
        while (r.getWidth() <= r.getLength()) {
            r.setWidth(r.getWidth() + 1);
            System.out.println(r.getLength() + ":" + r.getWidth());
        }
    }

}

/**
 * 长方形
 */
class Rectangle {
    private Integer length;
    private Integer width;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}

/**
 * 正方形
 */
class Square extends Rectangle {
    private Integer sideLength;

    @Override
    public Integer getLength() {
        return sideLength;
    }

    @Override
    public void setLength(Integer length) {
        sideLength = length;
    }

    @Override
    public Integer getWidth() {
        return sideLength;
    }

    @Override
    public void setWidth(Integer width) {
        sideLength = width;
    }
}