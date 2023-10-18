package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int factorial = 1;
        System.out.println(factorial);
        while (counter <= printToInclusive) {
            factorial = factorial * counter;
            counter ++;
            System.out.println(factorial);
        }
    }
}
