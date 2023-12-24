package school.mjc.stage0.conditions.finalTask;

import static java.lang.Float.NaN;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        int division = dividend/divider;

        if (division * divider == dividend){
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
