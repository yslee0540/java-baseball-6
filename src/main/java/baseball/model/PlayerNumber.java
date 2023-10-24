package baseball.model;

import baseball.util.NumberValidator;

public class PlayerNumber {
    private String inputNumber;
    NumberValidator numberValidator = new NumberValidator();

    public void setInputNumber(String inputNumber) {
        numberValidator.validateDigit(inputNumber);

        this.inputNumber = inputNumber;
    }

    public String getInputNumber() {
        return inputNumber;
    }
}
