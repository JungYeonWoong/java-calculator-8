package calculator.controller;

import calculator.domain.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final StringCalculator calculator = new StringCalculator();

    public void run() {
        String input = inputView.readInput();
        int result = calculator.calculate(input);
        outputView.printResult(result);
    }
}
