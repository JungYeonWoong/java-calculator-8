package calculator.domain;

import calculator.model.NumberParse;

import java.util.List;

public class StringCalculator {
    public int calculate(String input) {
        if (isBlank(input)) {
            return 0;
        }
// 문자열 파싱 구현
        List<Integer> numbers = NumberParse.parse(input);
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();  // 문자열 덧셈 구현
    }

    private boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
