package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int value = 5;
        int i = value;
        while (i > 1) {

            i--;
            value = value * i;
        }
        System.out.print(value);
    }
}
