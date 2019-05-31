public class Homework {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if ((a ^ b) && (c ^ d) || (a ^ c) && (b ^ d)) {
            return true;
        } else return false;
    }

    public static int leapYearCount(int year) {
        return year = year / 4 - year / 100 + year / 400;
    }

    final static double fault = 0.0001;

    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs((a + b) - c) <= fault) ? true : false;
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1); //
    }
}
