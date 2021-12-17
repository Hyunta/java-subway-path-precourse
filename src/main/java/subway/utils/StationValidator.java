package subway.utils;

import subway.repository.StationRepository;

public class StationValidator {
	public static final String ERROR_NO_STATION = "[ERROR] 존재하지 않는 역입니다.";

	public static void validateStation(String station) {
		isExist(station);
	}

	private static void isExist(String station) {
		if (!StationRepository.contains(station)) {
			throw new IllegalArgumentException(ERROR_NO_STATION);
		}
	}
}
