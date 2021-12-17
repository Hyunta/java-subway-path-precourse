package subway.utils;

import static subway.repository.DistancePathRepository.*;
import static subway.repository.TimePathRepository.*;

import subway.domain.Line;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.StationRepository;

public class Initializer {
	public static void init() {
		initStations();
		initLines();
		initDistancePath();
		initTimePath();
	}

	private static void initStations() {
		StationRepository.addStation(new Station("교대역"));
		StationRepository.addStation(new Station("강남역"));
		StationRepository.addStation(new Station("역삼역"));
		StationRepository.addStation(new Station("남부터미널역"));
		StationRepository.addStation(new Station("양재역"));
		StationRepository.addStation(new Station("양재시민의숲역"));
		StationRepository.addStation(new Station("매봉역"));
	}

	private static void initLines() {
		LineRepository.addLine(new Line("2호선"));
		LineRepository.addLine(new Line("3호선"));
		LineRepository.addLine(new Line("신분당선"));
	}
}
