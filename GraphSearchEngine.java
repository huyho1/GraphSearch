import java.util.List;
/**
 * An interface for a graph search engine that can perform breadth-first search (BFS)
 * between two Node objects that are part of the same Graph to
 * find a shortest path between them.
 */
interface GraphSearchEngine {
	/**
	 * Finds a shortest path, if one exists, between nodes s and
	 * t. The path will be a list: (s, ..., t). If no 
	 * path exists, then this method will return null.
	 * @param s the start node.
	 * @param t the target node.
	 * @return a shortest path in the form of a List of Node objects
	 * or null if no path exists.
	 */
	public List<Node> findShortestPath (Node s, Node t);
}
