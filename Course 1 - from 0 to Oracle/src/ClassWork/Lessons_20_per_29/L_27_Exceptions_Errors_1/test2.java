package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_1;

public class test2 {

    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());

    }

    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the exception was caught - " + e);
        }
        System.out.println("hello");
    }
}
