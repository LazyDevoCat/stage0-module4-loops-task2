package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        else {
            int counter = 0;
            int value = 1; // 2^0 = 1
            while (counter <= power) {
                System.out.println(value);
                value *= 2;
                counter++;
            }
        }
    }
}
