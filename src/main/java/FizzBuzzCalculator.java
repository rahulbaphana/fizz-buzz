import com.fizzbuzz.divisor.Divisor;
import com.fizzbuzz.divisor.IDivisible;
import com.fizzbuzz.model.Pair;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class FizzBuzzCalculator {
    private static List<IDivisible> divisors = asList(Divisor.FIZZ_BUZZ, Divisor.FIZZ, Divisor.BUZZ);

    public List<String> calculate(List<Integer> numbers) {
        return numbers
                .stream()
                .map(this::stringFor)
                .collect(toList());
    }

    private String stringFor(Integer number) {
        return divisors.stream()
                .filter(d -> d.representationFor(number).a)
                .findFirst()
                .map(p -> p.representationFor(number))
                .orElse(Pair.Right(number.toString()))
                .result;
    }
}
