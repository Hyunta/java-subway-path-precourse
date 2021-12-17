package subway.repository;

import java.util.List;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class TimePathRepository {
	public static final WeightedMultigraph<String, DefaultWeightedEdge> graph = new WeightedMultigraph(DefaultWeightedEdge.class);

	public static void initTimePath() {
		addStations();
		addPath();
	}

	public static List<String> getShortestPath(String start, String end) {
		DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(graph);
		List<String> shortestPath = dijkstraShortestPath.getPath(start, end).getVertexList();
		double pathWeight = dijkstraShortestPath.getPathWeight(start, end);
		return shortestPath;
	}

	public static int getShortestPathWeight(String start, String end) {
		DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(graph);
		double weight = dijkstraShortestPath.getPathWeight(start, end);
		return (int)weight;
	}

	private static void addPath() {
		graph.setEdgeWeight(graph.addEdge("교대역", "강남역"), 3);
		graph.setEdgeWeight(graph.addEdge("강남역", "역삼역"), 3);
		graph.setEdgeWeight(graph.addEdge("교대역", "남부터미널역"), 2);
		graph.setEdgeWeight(graph.addEdge("남부터미널역", "양재역"), 5);
		graph.setEdgeWeight(graph.addEdge("양재역", "매봉역"), 1);
		graph.setEdgeWeight(graph.addEdge("강남역", "양재역"), 8);
		graph.setEdgeWeight(graph.addEdge("양재역", "양재시민의숲역"), 3);
	}

	private static void addStations() {
		graph.addVertex("교대역");
		graph.addVertex("강남역");
		graph.addVertex("역삼역");
		graph.addVertex("남부터미널역");
		graph.addVertex("양재역");
		graph.addVertex("매봉역");
		graph.addVertex("양재시민의숲역");
	}
}
