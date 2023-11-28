package baseball.view;

import baseball.domain.GameResult;

public class OutputView {
    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printGameResult(GameResult result) {
        if (result.isNothing()) {
            System.out.println(NOTHING);
            return;
        }

        if (result.ball() == 0) {
            System.out.println(result.strike() + STRIKE);
            return;
        }

        if (result.strike() == 0) {
            System.out.println(result.ball() + BALL);
            return;
        }

        System.out.println(result.ball() + BALL + " " + result.strike() + STRIKE);
    }

    public static void printEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
