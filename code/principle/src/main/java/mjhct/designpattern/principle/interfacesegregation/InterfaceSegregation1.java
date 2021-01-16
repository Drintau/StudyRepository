package mjhct.designpattern.principle.interfacesegregation;

public class InterfaceSegregation1 {

    public static void main(String[] args) {

    }
}

interface interface1 {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements interface1 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}

class D implements interface1 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}

/**
 * A类通过接口interface1依赖(使用)B类，但只用到方法1，2，3
 */
class A {
    public void depend1(interface1 i) {
        i.method1();
    }

    public void depend2(interface1 i) {
        i.method2();
    }

    public void depend3(interface1 i) {
        i.method3();
    }
}

/**
 * C类通过接口interface1依赖(使用)D类，但只用到方法1，4，5
 */
class C {
    public void depend1(interface1 i) {
        i.method1();
    }

    public void depend4(interface1 i) {
        i.method4();
    }

    public void depend5(interface1 i) {
        i.method5();
    }
}