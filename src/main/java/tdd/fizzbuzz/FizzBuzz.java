package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        String result = "";
        if(number % 3 == 0){
            return result+="Fizz";
        }
        return String.valueOf(number);
    }
}
