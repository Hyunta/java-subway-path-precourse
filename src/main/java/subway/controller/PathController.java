package subway.controller;

import java.util.List;
import java.util.Scanner;

import subway.repository.DistancePathRepository;
import subway.repository.TimePathRepository;
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
		String start = InputView.requestStartStation(scanner);
		String end = InputView.requestEndStation(scanner);
		List<String> shortestPath = DistancePathRepository.getShortestPath(start, end);
		int shortestPathWeight = DistancePathRepository.getShortestPathWeight(start, end);
		OutputView.printDistanceResult(shortestPath, shortestPathWeight);

	}

	private void getMinTime() {
		String start = InputView.requestStartStation(scanner);
		String end = InputView.requestEndStation(scanner);
		List<String> shortestPath = TimePathRepository.getShortestPath(start, end);
		int shortestPathWeight = TimePathRepository.getShortestPathWeight(start, end);
		OutputView.printTimeResult(shortestPath, shortestPathWeight);
	}

	private void backToMainScreen() {
		MainController mainController = new MainController(scanner);
		mainController.run();
	}
}
