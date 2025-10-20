package calculator.domain;

import calculator.model.NumberParse;

import java.util.List;

public class StringCalculator {
    public int calculate(String input) {
        if (isBlank(input)) {
            return 0;
        }

        List<Integer> numbers = NumberParse.parse(input);
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
