package subway.controller;

import java.util.Scanner;

import subway.view.InputView;
import subway.view.OutputView;

public class PathController {
	private Scanner scanner;

	public PathController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printPathScreen();
		String request = InputView.requestPathFunction(scanner);
		if (request.equals("B")) {
			backToMainScreen();
		}
		if (request.equals("1")) {
			getMinDistance();
			backToMainScreen();
		}
		if (request.equals("2")) {
			getMinTime();
			backToMainScreen();
		}
	}

	private void backToMainScreen() {
		MainController mainController = new MainController(scanner);
		mainController.run();
	}
}
