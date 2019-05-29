public class Homework {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if (((a&&b)&&(!c&&!d))||((a&&c)&&(!b&&!d))||((a&&d)&&(!b&&!c))||((b&&c)&&(!a&&!d))||((b&&d)&&(!a&&!c))||((d&&c)&&(!b&&!a)))
        {
            return true;
        }
        else return false;
    }

    public static int leapYearCount(int year) {
        return year= year/4 - year/100 +year/400;
    }

    public static boolean doubleExpression(double a, double b, double c) {

        if (Math.abs((a + b) - c) <= 0.0001) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1); //
    }

}

