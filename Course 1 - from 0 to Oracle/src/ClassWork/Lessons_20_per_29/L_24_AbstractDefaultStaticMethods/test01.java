package ClassWork.Lessons_20_per_29.L_24_AbstractDefaultStaticMethods;

public class test01 {

}

class A {
    String s = "Hi";
    void abc() {
        System.out.println("???");
    }
}

class B extends A {
    String s = "Bye";
    void abc() {
        System.out.println("!!!");
    }
}

class C extends B {
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}