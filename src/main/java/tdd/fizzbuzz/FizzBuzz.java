package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result.length() == 0 ? String.valueOf(number) : result;
    }
}
