package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int counter = 0;

        if (multiplyByAndToInclusive == 0) {
        }

        else if (multiplyByAndToInclusive < 0) {
            int multi = -1;
            while (counter >= multiplyByAndToInclusive) {
                multi = -1 * multiplyByAndToInclusive * counter;
                counter--;
                System.out.println(multi);
            }
        }
        else {
            int mult = 1;
            while (counter <= multiplyByAndToInclusive) {

                mult = multiplyByAndToInclusive * counter;
                System.out.println(mult);
                counter++;

            }
        }

    }
}