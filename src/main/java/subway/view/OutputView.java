package subway.view;

public class OutputView {
	public static final String MAIN_SCREEN = "## 메인 화면";
	public static final String MAIN_ROUTE_SEARCH = "1. 경로 조회";
	public static final String MAIN_QUIT = "Q. 종료";

	public static final String PATH_STYLE = "## 경로 기준";
	public static final String PATH_LEAST_DISTANCE = "1.최단 거리";
	public static final String PATH_LEAST_TIME = "2. 최소 시간";
	public static final String PATH_BACK = "B. 돌아가기";

	public static void printMainScreen() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(MAIN_SCREEN).append("\n");
		stringBuilder.append(MAIN_ROUTE_SEARCH).append("\n");
		stringBuilder.append(MAIN_QUIT).append("\n");
		System.out.println(stringBuilder);
	}

	public static void printPathScreen() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(PATH_STYLE).append("\n");
		stringBuilder.append(PATH_LEAST_DISTANCE).append("\n");
		stringBuilder.append(PATH_LEAST_TIME).append("\n");
		stringBuilder.append(PATH_BACK).append("\n");
		System.out.println(stringBuilder);
	}
}
