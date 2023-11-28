package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Stream;

public class RandomNumberGenerator {
    private static final int BASEBALL_START_NUMBER = 1;
    private static final int BASEBALL_END_NUMBER = 9;
    private static final int BASEBALL_LENGTH = 3;

    public static List<Integer> generate() {
//        List<Integer> numbers = new ArrayList<>();
//        while (numbers.size() < BASEBALL_LENGTH) {
//            int randomNumber = Randoms.pickNumberInRange(BASEBALL_START_NUMBER, BASEBALL_END_NUMBER);
//            if (!numbers.contains(randomNumber)) {
//                numbers.add(randomNumber);
//            }
//        }
//        return numbers;
        return Stream.generate(RandomNumberGenerator::pickRandomNumber)
                .distinct()
                .limit(BASEBALL_LENGTH)
                .toList();
    }

    private static int pickRandomNumber() {
        return Randoms.pickNumberInRange(BASEBALL_START_NUMBER, BASEBALL_END_NUMBER);
    }
}
