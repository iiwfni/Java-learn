package ClassWork.Lessons_10_per_19.L_15_while;

public class test13_10 {
    public static void main(String[] args) {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;

            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}
