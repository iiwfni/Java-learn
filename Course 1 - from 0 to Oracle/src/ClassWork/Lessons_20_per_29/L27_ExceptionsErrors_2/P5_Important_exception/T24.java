package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P5_Important_exception;

public class T24 { // exception is not Error
    static void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
