import java.util.*;
/**
 * Interface for a node in a graph; each Node must have a name
 * and a Collection of neighbors. For example, the neighbors of 
 * an actress/actor node will be movies, and vice-versa.
 */
interface Node {
	/**
	 * Returns the name of the node (e.g., "Judy Garland").
	 * @return the name of the Node.
	 */
	public String getName ();

	/**
	 * Returns the Collection of neighbors of the node.
	 * @return the Collection of all the neighbors of this Node.
	 */
	public Collection<? extends Node> getNeighbors ();
}
