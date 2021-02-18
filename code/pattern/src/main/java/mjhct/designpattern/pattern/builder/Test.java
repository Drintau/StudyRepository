package mjhct.designpattern.pattern.builder;

/**
 * 建造者模式
 */

class Computer{
    private String cpu;
    private String hardDisk;
    private String memory;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}

interface Builder{
    void setCpu();
    void setHardDisk();
    void setMemory();
    Computer build();
}

class Director{
    public Computer build(Builder b){
        b.setCpu();
        b.setHardDisk();
        b.setMemory();
        return b.build();
    }
}

// 低端电脑
class LowComputerBuilder implements Builder{

    private Computer c = new Computer();

    @Override
    public void setCpu() {
        c.setCpu("酷睿i3");
    }

    @Override
    public void setHardDisk() {
        c.setHardDisk("500G机械");
    }

    @Override
    public void setMemory() {
        c.setMemory("8G");
    }

    @Override
    public Computer build() {
        return c;
    }
}

// 高端电脑
class AdvancedComputerBuilder implements Builder{

    private Computer c = new Computer();

    @Override
    public void setCpu() {
        c.setCpu("酷睿i7");
    }

    @Override
    public void setHardDisk() {
        c.setHardDisk("1T固态");
    }

    @Override
    public void setMemory() {
        c.setMemory("32G");
    }

    @Override
    public Computer build() {
        return c;
    }
}

// ==================================================时空线，上面是作者，下面是客户端

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        AdvancedComputerBuilder advancedComputerBuilder = new AdvancedComputerBuilder();

        Computer c1 = director.build(lowComputerBuilder);
        System.out.println(c1);

        Computer c2 = director.build(advancedComputerBuilder);
        System.out.println(c2);
    }

}
