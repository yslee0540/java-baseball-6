package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.GameResult;
import baseball.service.BaseballService;
import baseball.util.Validator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    private static final String RESTART = "1";
    private BaseballService baseballService;

    public BaseballController() {
        this.baseballService = new BaseballService();
    }

    public void startGame() {
        OutputView.printStartMessage();
        do {
            baseballService.initComputerNumbers();
            playGame();
        } while (restart());
    }

    private void playGame() {
        GameResult result;
        do {
            result = getGameResult(initPlayerNumbers());
            OutputView.printGameResult(result);
        } while (!result.isAllStrike());
        OutputView.printEndMessage();
    }

    private Baseball initPlayerNumbers() {
        String input = InputView.readBaseballNumbers();
        return new Baseball(Validator.stringToList(input));
    }

    private GameResult getGameResult(Baseball player) {
        return baseballService.playGame(player);
    }

    private boolean restart() {
        String input = InputView.readGameCommand();
        Validator.validateCommand(input);
        return input.equals(RESTART);
    }
}