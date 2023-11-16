import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * Implements the GraphSearchEngine interface.
 */
public class GraphSearchEngineImpl implements GraphSearchEngine {
	public GraphSearchEngineImpl () {
	}
	
	/**
	 * Finds the shortest path by using BFS search.
	 * @param s is the actor1 which is where we're starting the search.
	 * @param t is the actor2 which we are trying to find the path to.
	 * Returns a list of the nodes during it's path
	 * @return the node list path.
	 */
	public List<Node> findShortestPath(Node s, Node t) {
		List<Node> visited = new ArrayList<Node>();
		Queue<Node> notVisited = new LinkedList<Node>();
		Map<Node, Integer> sDistance = new HashMap<Node, Integer>();
		List<Node> path = null;

		notVisited.add(s);
		sDistance.put(s, 0);
		while (notVisited.size() > 0) {
			Node node = notVisited.poll();
			visited.add(node);
			if (node.equals(t)) {
				path = new ArrayList<Node>();
				int distance = sDistance.get(node);
				for (int i = 0; i < distance; i++) {
					path.add(node);
					for (Node neighbor : node.getNeighbors()) {
						if (visited.contains(neighbor) && sDistance.get(neighbor) == sDistance.get(node) - 1) {
							node = neighbor;
							break;
				}
			}
		}

				path.add(s);
				break;
			} else {
				for (Node k : node.getNeighbors()) {
					if (!visited.contains(k)) {
						notVisited.add(k);
						sDistance.put(k, sDistance.get(node) + 1);
					}
				}
			}
		}
		
		if (path != null)
			Collections.reverse(path);
		return path;
	}
}