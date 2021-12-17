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
			showMinDistance();
			backToMainScreen();
		}

		if (request.equals(REQUEST_MIN_TIME)) {
			showMinTime();
			backToMainScreen();
		}

		if (request.equals(REQUEST_BACK)) {
			backToMainScreen();
		}
	}

	private void showMinDistance() {
		String start = InputView.requestStartStation(scanner);
		String end = InputView.requestEndStation(scanner);
		if (start.equals(end)) {
			System.out.println("[ERROR] 출발역과 도착역이 동일합니다.");
			run();
		}
		List<String> shortestPath = DistancePathRepository.getShortestPath(start, end);
		int shortestPathWeight = DistancePathRepository.getShortestPathWeight(start, end);
		OutputView.printDistanceResult(shortestPath, shortestPathWeight);

	}

	private void showMinTime() {
		String start = InputView.requestStartStation(scanner);
		String end = InputView.requestEndStation(scanner);
		if (start.equals(end)) {
			System.out.println("[ERROR] 출발역과 도착역이 동일합니다.");
			run();
		}
		List<String> shortestPath = TimePathRepository.getShortestPath(start, end);
		int shortestPathWeight = TimePathRepository.getShortestPathWeight(start, end);
		OutputView.printTimeResult(shortestPath, shortestPathWeight);
	}

	private void backToMainScreen() {
		MainController mainController = new MainController(scanner);
		mainController.run();
	}
}
