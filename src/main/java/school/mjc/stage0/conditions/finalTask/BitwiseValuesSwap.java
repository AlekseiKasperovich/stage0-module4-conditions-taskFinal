package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = first ^ second ^ (second = first);
        System.out.println(first + "\n" + second);
    }
}
