package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        if (lengthOfLastNumber > 0) {
            for (int i = 9; lengthOfLastNumber != 0; lengthOfLastNumber--) {
                sum += i;
                i = i * 10 + 9;
            }
        }
        System.out.println(sum);
    }
}
