package subway.controller;

import java.util.Scanner;

import subway.view.InputView;
import subway.view.OutputView;

public class PathController {
	public static final String REQUEST_MIN_DISTANCE = "1";
	public static final String REQUEST_MIN_TIME = "2";
	public static final String REQUEST_BACK = "B";

	private Scanner scanner;

	public PathController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printPathScreen();
		String request = InputView.requestPathFunction(scanner);

		if (request.equals(REQUEST_MIN_DISTANCE)) {
			getMinDistance();
			backToMainScreen();
		}

		if (request.equals(REQUEST_MIN_TIME)) {
			getMinTime();
			backToMainScreen();
		}

		if (request.equals(REQUEST_BACK)) {
			backToMainScreen();
		}
	}

	private void getMinDistance() {

	}

	private void getMinTime() {

	}

	private void backToMainScreen() {
		MainController mainController = new MainController(scanner);
		mainController.run();
	}
}
