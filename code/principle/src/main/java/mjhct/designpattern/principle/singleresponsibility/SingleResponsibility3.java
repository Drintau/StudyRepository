package mjhct.designpattern.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.runAir("飞机");
    }

}

/**
 * 交通工具
 * 方式3
 * 1. 这种修改没有对原来的类做大的修改，只是增加了方法
 * 2. 这里虽然没有在类级别遵循单一职责原则，但在方法级别遵守单一职责原则
 */
class Vehicle3 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行...");
    }
}
