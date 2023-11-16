import java.util.*;

/**
 * An interface for a movie and actors bi-partite graph that contains inter-connected nodes.
 */
interface IMDBGraph {
	/**
	 * Gets all the actor nodes in the graph.
	 * @return a collection of all the actor and actress nodes in the graph.
	 */
	public Collection<? extends Node> getActors ();

	/**
	 * Gets all the movie nodes in the graph.
	 * @return a collection of all the movie nodes in the graph.
	 */
	public Collection<? extends Node> getMovies ();

	/**
	 * Returns the movie node having the specified name.
	 * @param name the name of the requested movie
	 * @return the movie node associated with the specified name or null
	 * if no such movie exists.
	 */
	public Node getMovie (String name);

	/**
	 * Returns the actor node having the specified name.
	 * @param name the name of the requested actor
	 * @return the actor node associated with the specified name or null
	 * if no such actor exists.
	 */
	public Node getActor (String name);
}
