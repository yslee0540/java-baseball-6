package baseball.domain;

public record GameResult(int ball, int strike) {
    private static final int WINNING_COUNT = 3;

    public boolean isAllStrike() {
        return strike == WINNING_COUNT;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }
}
