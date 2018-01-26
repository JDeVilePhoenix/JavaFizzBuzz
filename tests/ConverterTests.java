/* 1. Create one or more unit tests which validate a Java class with a single method that takes an integer
   as an argument and returns a string representation of that number (e.g. Input:14, Output:”14”).
*/
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTests {
    private final Converter converter = new Converter();

    @Test
    public void intToString_whenPositiveConverted_valueDoesMatch() throws Exception {
        assertEquals("10", converter.intToString(10));
    }

    @Test
    public void intToString_whenNegativeConverted_valueDoesMatch() throws Exception {
        assertEquals("-10", converter.intToString(-10));
    }

    @Test
    public void intToString_whenZeroConverted_valueDoesMatch() throws Exception {
        assertEquals("0", converter.intToString(0));
    }
}