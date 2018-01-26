/* 3. Create a class which satisfies your tests.
 */
public class FizzBuzz extends Converter{

    public final String checkFizzBuzz(int i) {
        final int fizz = i%3;
        final int buzz = i%5;

        // no numbers are divisible by zero
        if(i == 0) {
            return Converter.intToString(0);
        }
        if(fizz == 0 && buzz == 0) {
            return "FizzBuzz";
        }
        if(fizz == 0) {
            return "Fizz";
        }
        if(buzz == 0) {
            return "Buzz";
        }

        return Converter.intToString(i);
    }
}
