package calculator.model;

import java.util.regex.Pattern;

public class Delimiter {

    // 구분자로 나눈 숫자 문자열 반환
    public static String[] split(String input) {
        // 콘솔에서 \n 입력 시 \\n으로 전달됨
        input = input.replace("\\n", "\n");

        // 커스텀 구분자 처리 구현
        if (input.startsWith("//")) {
            String[] parts = input.split("\n", 2);

            if (parts.length < 2) { // 예외 처리 구현
                throw new IllegalArgumentException("커스텀 구분자 형식이 잘못되었습니다.");
            }

            String customDelimiter = parts[0].substring(2);
            return parts[1].split(Pattern.quote(customDelimiter));
        }

        return input.split(",|:");
    }
}
