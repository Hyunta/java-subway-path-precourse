package subway.view;

public class OutputView {
	public static final String MAIN_SCREEN = "## 메인 화면";
	public static final String MAIN_ROUTE_SEARCH = "1. 경로 조회";
	public static final String MAIN_QUIT = "Q. 종료";

	public static void printMainScreen() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(MAIN_SCREEN).append("\n");
		stringBuilder.append(MAIN_ROUTE_SEARCH).append("\n");
		stringBuilder.append(MAIN_QUIT).append("\n");
		System.out.println(stringBuilder);
	}
}
