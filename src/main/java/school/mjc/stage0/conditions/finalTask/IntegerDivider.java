package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int a;
        if (divider == 0) {
            a = 0;
        } else {
            int res = dividend / divider;
            if (res * divider == dividend) {
                a = 1;
            } else {
                a = 2;
            }
        }
        switch (a) {
            case 0:
                System.out.println("division by zero");
                break;
            case 1:
                System.out.println("can be divided completely");
                break;
            case 2:
                System.out.println("cannot be divided completely");
                break;
        }
    }
}
