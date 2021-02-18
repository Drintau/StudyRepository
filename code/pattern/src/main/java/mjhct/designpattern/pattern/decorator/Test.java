package mjhct.designpattern.pattern.decorator;

/**
 * 装饰者模式
 * Head First设计模式案例：咖啡与调料
 * 原本有一个抽象咖啡类和几个具体的咖啡，现在要实现咖啡添加调料的功能
 */

// beverage 除水以外的饮料
abstract class Beverage{
    private String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract double cost();

}

class ACoffee extends Beverage{

    public ACoffee() {
        super("ACoffee");
    }

    @Override
    public double cost() {
        return 1.0;
    }
}

// ==========================================================
// 实现添加调料功能，不能修改上面原作者已有的代码（即不能违反开闭原则）

// 抽象调料类，即装饰者：继承要扩展的对象，同时持有对方的引用。
abstract class Condiment extends Beverage{

    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        super("调料");
        this.beverage = beverage;
    }

}

// 牛奶，具体的调料
class Milk extends Condiment{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 加牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}

// 糖，具体的调料
class Sugar extends Condiment{

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 加糖";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}


// =========================================================

public class Test {

    public static void main(String[] args) {
        Beverage b = new ACoffee();
        System.out.println(b.getDescription() + ":" + b.cost());
        Beverage b2 = new Milk(b);
        System.out.println(b2.getDescription() + ":" + b2.cost());
        Beverage b3 = new Milk(b2);
        System.out.println(b3.getDescription() + ":" + b3.cost());
        Beverage b4 = new Sugar(b3);
        System.out.println(b4.getDescription() + ":" + b4.cost());
    }

}
