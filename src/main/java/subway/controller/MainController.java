package subway.controller;

import java.util.Scanner;

import subway.view.OutputView;

public class MainController {
	private Scanner scanner;

	public MainController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printMainScreen();
	}
}
