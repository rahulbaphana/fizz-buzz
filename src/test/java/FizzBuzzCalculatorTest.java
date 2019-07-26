import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCalculatorTest {
    private FizzBuzzCalculator fizzBuzzCalculator;

    @BeforeEach
    void setUp() {
        fizzBuzzCalculator = new FizzBuzzCalculator();
    }

    @Test
    void should_print_fizz_for_element_divisible_by_3() {
        List<String> evaluatedList = fizzBuzzCalculator.calculate(singletonList(3));

        assertEquals("fizz", evaluatedList.get(0));
    }

    @Test
    void should_print_fizz_for_element_divisible_by_5() {
        List<String> evaluatedList = fizzBuzzCalculator.calculate(singletonList(5));

        assertEquals("buzz", evaluatedList.get(0));
    }

    @Test
    void should_print_number_for_element_not_divisible_by_3_or_5() {
        List<String> evaluatedList = fizzBuzzCalculator.calculate(asList(1, 2, 4));

        assertEquals(asList("1", "2", "4"), evaluatedList);
    }

    @Test
    void should_print_fizzbuzz_for_element_divisible_by_3_and_5() {
        List<String> evaluatedList = fizzBuzzCalculator.calculate(asList(1, 2, 15));

        assertEquals(asList("1", "2", "fizzbuzz"), evaluatedList);
    }

    @Test
    void should_print_fizz_buzz_and_fizzbuzz_for_element_divisible_by_3_and_5() {
        List<String> evaluatedList = fizzBuzzCalculator.calculate(asList(1, 2, 3, 4, 5, 15, 11, 8));

        assertEquals(asList("1", "2", "fizz", "4", "buzz", "fizzbuzz", "11", "8"), evaluatedList);
    }
}
