package mjhct.designpattern.principle.singleresponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

}

/**
 * 方式2
 * 1. 遵循单一职责原则
 * 2. 在方式1基础上改动很大，即将类分解，同时修改客户端
 * 3. 改进：直接修改Vehicle类，改动代码比较少
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上运行...");
    }
}