/* 1. Create one or more unit tests which validate a Java class with a single method that takes an integer
   as an argument and returns a string representation of that number (e.g. Input:14, Output:”14”).
*/
public class Converter {

    public static final String intToString(final int number) {
        final String num = Integer.toString(number);
        return num;
    }

}
