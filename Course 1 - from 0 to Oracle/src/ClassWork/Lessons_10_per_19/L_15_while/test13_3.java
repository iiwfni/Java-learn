package ClassWork.Lessons_10_per_19.L_15_while;

public class test13_3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;

        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            a++;
        }
    }
}
