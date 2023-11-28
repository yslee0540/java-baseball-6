package baseball.domain;

import baseball.util.Validator;
import java.util.List;
import java.util.stream.IntStream;

public class Baseball {
    private final List<Integer> numbers;

    public Baseball(List<Integer> numbers) {
        Validator.validate(numbers);
        this.numbers = numbers;
    }

    public int countSameNumbers(Baseball computer) {
        return (int) computer.numbers.stream()
                .filter(numbers::contains)
                .count();
    }

    public int countSameNumbersByIndex(Baseball computer) {
        return (int) IntStream.range(0, numbers.size())
                .filter(i -> numbers.get(i).equals(computer.numbers.get(i)))
                .count();
    }
}
