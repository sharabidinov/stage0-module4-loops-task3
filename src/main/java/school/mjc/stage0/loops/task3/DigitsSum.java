package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        for (; t != 0; t /= 10) {
            sum += t % 10;
        }
        if (sum < 0) {
            sum *= -1;
            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}
