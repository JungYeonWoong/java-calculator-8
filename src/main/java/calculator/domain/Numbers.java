package calculator.domain;

import java.util.List;

public class Numbers {
    private final List<Integer> values;

    public Numbers(List<Integer> values) {
        this.values = values;
    }

    public int sum() {
        return values.stream().mapToInt(Integer::intValue).sum();
    }
}