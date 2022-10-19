package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int ans = 1;
        while (multiplyByAndToInclusive > 0) {
            if (multiplyByAndToInclusive % 2 == 1)
                ans += multiplyByAndToInclusive << counter;
            counter++;
            multiplyByAndToInclusive /= 2;
            System.out.println(ans);

        }

    }
}
