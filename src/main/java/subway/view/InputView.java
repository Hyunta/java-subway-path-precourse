package subway.view;

import java.util.Scanner;

import subway.utils.FunctionValidator;

public class InputView {
	public static final String REQUEST_FUNCTION = "## 원하는 기능을 선택하세요.";

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
}
