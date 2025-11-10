package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int mult = 1;
        while (counter <= printToInclusive) {
            if (counter == 0) {
                mult = 1;
            }
            else {
                mult = mult * counter;
            }
            System.out.println(mult);
            counter++;
        }
    }
}
