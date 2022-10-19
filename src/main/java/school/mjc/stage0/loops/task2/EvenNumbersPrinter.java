package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int number = 20;
        if (number % 2 == 1)
            number++;

        while (number <= printTillInclusive) {
            System.out.println(number);
            number = number + 2;
        }
    }
}
