package ClassWork.Lessons_20_per_29.L_26_equals_toString;

public class Method_2 {
    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(String... b) {
        System.out.println("B");
    }

    static void abc(Object s) {
        System.out.println("C");
    }

    static void abc(String s1, String s2) {
        System.out.println("D");
    }


    static void def(Long a) {
        System.out.println("E");
    }

    static void def(Long... a) {
        System.out.println("F");
    }

    static void def(long a) {
        System.out.println("G");
    }

    static void def(Object a) {
        System.out.println("H");
    }

    static void def(Integer a) {
        System.out.println("I");
    }

    public static void main(String[] args) {
        Method_2 t = new Method_2();
        t.abc("s", "!");

        t.def(50);
    }
}
