package powerpackage;

public class Power {
    public static int find(int base, int exponent) {
        int power = 1;
        for (int i = 0; i<exponent; i++) {
            power *= base;
        }
        return power;
    }
}
