package Individual_Project;
import java.util.*;
/**
 * A class representing a node using its longitude x,its latitude y and the path_movt it belongs to.
*/
public class Node extends Point {
	private Path_movt path_movt;

	/**
	 * A list that contains all the nodes in the map.
	 */
	static ArrayList<Node> nodes = new ArrayList<Node>();
	
	/**
	 * @param x longitude
	 * @param y latitude
	 * @param Path_movt path_movt
	 */
	public Node(double x, double y, Path_movt path_movt) { 

		super(x, y);
		this.path_movt = path_movt;
	}

	/**
	 * @return the Path_movt
	 */
	public Path_movt getPath_movt() { 

		return path_movt;
	}

	/**
	 * @param path_movt the path_movt to set
	 */
	public void setPath_movt(Path_movt path_movt) { 

		this.path_movt = path_movt;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

//		txtWriter.name_id(path_movt.getPath_movtName());
		return "Node with path_movtId = " + path_movt.getPath_movtId() + " path_movtName = " + path_movt.getPath_movtName() + " x = " + getX() + ", y = " + getY();
	}
}
