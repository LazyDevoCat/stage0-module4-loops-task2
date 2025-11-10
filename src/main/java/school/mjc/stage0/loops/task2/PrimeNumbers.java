package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;

        while (counter <= printToInclusive) {
            boolean isPrime = true;
            int divisor = 2;
            while (divisor < counter) {
                if (counter % divisor == 0) {
                    isPrime = false;
                }
                divisor++;
            }
            if (isPrime) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
