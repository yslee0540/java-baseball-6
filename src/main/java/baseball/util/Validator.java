package baseball.util;

import java.util.List;
import java.util.stream.Collectors;

public class Validator {
    private static final int BASEBALL_LENGTH = 3;
    private static final int MIN_BASEBALL_NUMBER = 1;
    private static final int MAX_BASEBALL_NUMBER = 9;

    public static void validate(List<Integer> numbers) {
        validateLength(numbers);
        validateRange(numbers);
        validateDuplicate(numbers);
    }

    private static void validateLength(List<Integer> numbers) {
        if (numbers.size() != BASEBALL_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 숫자는 3자리를 입력해야 합니다.");
        }
    }

    private static void validateRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < MIN_BASEBALL_NUMBER || number > MAX_BASEBALL_NUMBER) {
                throw new IllegalArgumentException("[ERROR] 1~9 사이의 숫자를 입력해주세요.");
            }
        }
    }

    private static void validateDuplicate(List<Integer> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException("[ERROR] 중복된 숫자입니다.");
        }
    }

    private static void validateInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 숫자로만 이루어진 값을 입력해주세요.");
        }
    }

    public static List<Integer> stringToList(String input) {
        validateInteger(input);
        return input.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }

    public static void validateCommand(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException("[ERROR] 1이나 2를 입력해야 합니다.");
        }
    }
}
