package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1() {
        //given
        int number = 1;
        String expectedResult = "1";
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);
        //then
        assertEquals(expectedResult, result);
    }

}
