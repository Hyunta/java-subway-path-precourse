package subway.controller;

import java.util.Scanner;

import subway.view.InputView;
import subway.view.OutputView;

public class MainController {
	private Scanner scanner;

	public MainController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printMainScreen();
		String request = InputView.requestMainFunction(scanner);
		if (request.equals("Q")) {
			System.exit(0);
		}
		if (request.equals("1")) {
			PathController pathController = new PathController(scanner);
			pathController.run();
		}
	}
}
