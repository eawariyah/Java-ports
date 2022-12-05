package Individual_Project;

/**
 * A class representing a client in the map using its longitude x, its latitude y and the
 * node that is closest to him.
*/

public class Path_movt_ extends Point {
	private Node closestNode;

	/**
	 * @param x
	 * @param y
	 */
	public Path_movt_(double x, double y) { 

		super(x, y);
		this.closestNode = closestNodeByPoint();
	}

	/**
	 * @return the closestNode
	 */
	public Node getClosestNode() { 

		return closestNode;
	}

	/**
	 * @param closestNode the closestNode to set
	 */
	public void setClosestNode(Node closestNode) { 

		this.closestNode = closestNode;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return "Path_movt_ with  = " + closestNode.toString() + " x = " + getX() + " y = " + getY() + "]";
	}	
}
