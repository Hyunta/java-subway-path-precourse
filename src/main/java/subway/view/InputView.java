package subway.view;

import java.util.Scanner;

import subway.utils.FunctionValidator;
import subway.utils.StationValidator;

public class InputView {
	public static final String REQUEST_FUNCTION = "## 원하는 기능을 선택하세요.";
	public static final String REQUEST_START_STATION = "## 출발역을 입력하세요.";
	public static final String REQUEST_END_STATION = "## 도착역을 입력하세요.";

	public static String requestMainFunction(Scanner scanner) {
		try {
			System.out.println(REQUEST_FUNCTION);
			String inputValue = scanner.next();
			FunctionValidator.validateMainFunction(inputValue);
			return inputValue;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return requestMainFunction(scanner);
		}
	}

	public static String requestPathFunction(Scanner scanner) {
		try {
			System.out.println(REQUEST_FUNCTION);
			String inputValue = scanner.next();
			FunctionValidator.validatePathFunction(inputValue);
			return inputValue;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return requestPathFunction(scanner);
		}
	}

	public static String requestStartStation(Scanner scanner) {
		return getStation(scanner, REQUEST_START_STATION);
	}

	public static String requestEndStation(Scanner scanner) {
		return getStation(scanner, REQUEST_END_STATION);
	}

	private static String getStation(Scanner scanner, String requestMessage) {
		try {
			System.out.println(requestMessage);
			String inputValue = scanner.next();
			StationValidator.validateStation(inputValue);
			return inputValue;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return requestStartStation(scanner);
		}
	}
}
