package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String BASEBALL_NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String readBaseballNumbers() {
        System.out.print(BASEBALL_NUMBER_INPUT_MESSAGE);
        return Console.readLine().trim();
    }

    public static String readGameCommand() {
        System.out.println(RESTART_MESSAGE);
        return Console.readLine().trim();
    }
}
