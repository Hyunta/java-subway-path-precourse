package subway.controller;

import java.util.Scanner;

import subway.view.OutputView;

public class PathController {
	private Scanner scanner;

	public PathController(Scanner scanner) {
		this.scanner = scanner;
	}

	public void run() {
		OutputView.printPathScreen();
	}
}
