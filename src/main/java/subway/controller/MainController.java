package subway.controller;

import java.util.Scanner;

import subway.view.InputView;
import subway.view.OutputView;

public class MainController {
	public static final String REQUEST_PATH = "1";
	public static final String REQUEST_QUIT = "Q";

	private Scanner scanner;

	public MainController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printMainScreen();
		String request = InputView.requestMainFunction(scanner);

		if (request.equals(REQUEST_PATH)) {
			PathController pathController = new PathController(scanner);
			pathController.run();
		}

		if (request.equals(REQUEST_QUIT)) {
			System.exit(0);
		}
	}
}
