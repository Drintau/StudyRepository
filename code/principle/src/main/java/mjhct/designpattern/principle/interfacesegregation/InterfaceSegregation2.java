package mjhct.designpattern.principle.interfacesegregation;

public class InterfaceSegregation2 {

    public static void main(String[] args) {

    }
}

interface interface2 {
    void method1();
}

interface interface3 {
    void method2();
    void method3();
}

interface interface4 {
    void method4();
    void method5();
}

class B2 implements interface2,interface3 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

class D2 implements interface2,interface4 {

    @Override
    public void method1() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}

class A2 {
    public void depend1(interface2 i) {
        i.method1();
    }

    public void depend2(interface3 i) {
        i.method2();
    }

    public void depend3(interface3 i) {
        i.method3();
    }
}

class C2 {
    public void depend1(interface2 i) {
        i.method1();
    }

    public void depend4(interface4 i) {
        i.method4();
    }

    public void depend5(interface4 i) {
        i.method5();
    }
}