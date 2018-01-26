/* 2. Extend the tests to incorporate the rules of ‘FizzBuzz’ (multiples of 3 should return the string “Fizz”,
   multiples of 5 should return the string “Buzz”, multiples of both should return “FizzBuzz”).
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTests {
    private final FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_whenReturnFizz_valueDoesMatch() throws Exception {
        assertEquals("Fizz", fizzbuzz.checkFizzBuzz(3));
    }

    @Test
    public void fizzBuzz_whenReturnBuzz_valueDoesMatch() throws Exception {
        assertEquals("Buzz", fizzbuzz.checkFizzBuzz(5));
    }

    @Test
    public void fizzBuzz_whenReturnFizzBuzz_valueDoesMatch() throws Exception {
        assertEquals("FizzBuzz", fizzbuzz.checkFizzBuzz(15));
    }

    @Test
    public void fizzBuzz_whenReturnNumber_valueDoesMatch() throws Exception {
        assertEquals("7", fizzbuzz.checkFizzBuzz(7));
    }

    @Test
    public void fizzBuzz_whenNegativeValue_valueDoesMatch() throws Exception {
        assertEquals("Fizz", fizzbuzz.checkFizzBuzz(-3));
    }

    @Test
    public void fizzBuzz_whenZeroValue_valueDoesMatch() throws Exception {
        assertEquals("0", fizzbuzz.checkFizzBuzz(0));
    }


}
