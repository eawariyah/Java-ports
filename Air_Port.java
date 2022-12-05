package Individual_Project;
import java.util.*;
/**
 * A class representing a airports__pos in the map using its longitude x, its latitude y and its unique id.
*/
public class Air_Port extends Point{
	private int airports__posId;
	private Node closestNode;
	static ArrayList<Air_Port> airports__start = new ArrayList<Air_Port>();
	
	/**
	 * @param x longitude
	 * @param y latitude
	 * @param k unique id
	 */
	public Air_Port(double x, double y, int k) { 

		super(x, y);
		this.airports__posId = k;
		this.closestNode = closestNodeByPoint();
	}

	/**
	 * @return the closestStreet
	 */
	public Node getClosestNode() { 

		return closestNode;
	}

	/**
	 * @param closestStreet the closestStreet to set
	 */
	public void setClosestNode(Node closestNode) { 

		this.closestNode = closestNode;
	}

	/**
	 * @return the airports__posId
	 */
	public int getAir_PortId() { 

		return airports__posId;
	}

	/**
	 * @param airports__posId the unique id to set
	 */
	public void setAir_PortId(int airports__posId) { 

		this.airports__posId = airports__posId;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return "Air_Port with airports__posId = " + airports__posId + " closest node = " + closestNode.toString() + " x = " + getX() + " y = " + getY() ;
	}
	
	
}
	
	
