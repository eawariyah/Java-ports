package Individual_Project;

import java.util.ArrayList;
import java.util.Objects;


 /**
 * The class State extends node
 */ 
public class State extends Node {
    private double distance;
    private double heuristic;
    private ArrayList < State > path;


/** 
 *
 * State
 *
 * @param x  the x
 * @param y  the y
 * @param path_movt  the path_movt
 * @param distance  the distance
 * @param <  the <
 * @return public
 */
    public State(double x, double y, Path_movt path_movt, double distance, ArrayList < State > path) { 

        super(x, y, path_movt);
        this.distance = distance;
        this.heuristic = computeHeuristic();
        this.path = path;
    }


/** 
 *
 * Gets the distance
 *
 * @return the distance
 */
    public double getDistance() { 

        return distance;
    }


/** 
 *
 * Sets the distance
 *
 * @param distance  the distance
 */
    public void setDistance(double distance) { 

        this.distance = distance;
    }


/** 
 *
 * Gets the heuristic
 *
 * @return the heuristic
 */
    public double getHeuristic() { 

        return heuristic;
    }


/** 
 *
 * Sets the heuristic
 *
 * @param heuristic  the heuristic
 */
    public void setHeuristic(double heuristic) { 

        this.heuristic = heuristic;
    }


/** 
 *
 * Gets the path
 *
 * @return the path
 */
    public ArrayList < State > getPath() { 

        return path;
    }


/** 
 *
 * Sets the path
 *
 * @param <  the <
 */
    public void setPath(ArrayList < State > path) { 

        this.path = path;
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "State with x = " + getX() + " y = " + getY() + " path_movt id " + getPath_movt().getPath_movtId() + " path_movt name " + getPath_movt().getPath_movtName() +
            " distance = " + distance + ", heuristic = " + heuristic;
    }


/** 
 *
 * Compute heuristic
 *
 * @return double
 */
    public double computeHeuristic() { 

        return haversine(getY(), getX(), Air_Port_Values.client.getY(), Air_Port_Values.client.getX());
    }

    @Override

/** 
 *
 * Hash code
 *
 * @return int
 */
    public int hashCode() { 

        return Objects.hash(distance, heuristic);
    }




}
