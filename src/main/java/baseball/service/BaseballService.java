package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.GameResult;
import baseball.util.RandomNumberGenerator;

public class BaseballService {
    private Baseball computer;

    public void initComputerNumbers() {
        computer = new Baseball(RandomNumberGenerator.generate());
    }

    public GameResult playGame(Baseball player) {
        int strikeCount = player.countSameNumbersByIndex(computer);
        int sameCount = player.countSameNumbers(computer);
        return new GameResult(sameCount - strikeCount, strikeCount);
    }
}