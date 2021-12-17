package subway.utils;

import java.util.Arrays;
import java.util.List;

public class FunctionValidator {
	public static final String ERROR_NO_FUNCTION = "[ERROR] 입력하신 기능이 존재하지 않습니다.";
	private static List<String> mainFunctionList = Arrays.asList("1", "Q");

	public static void validateMainFunction(String inputValue) {
		if (!mainFunctionList.contains(inputValue)) {
			throw new IllegalArgumentException(ERROR_NO_FUNCTION);
		}
	}
}
