package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int sum = dividend / divider;
        if(dividend == divider * sum) {
            System.out.println("can be divided completely");
        } else {
             System.out.println("cannot be divided completely");
        }
    }
}
