package Individual_Project;

import java.util.ArrayList;
import java.util.TreeSet;


 /**
 * The class Route
 */ 
public class Route {
	private ArrayList<State> route = new ArrayList<State>();
	private double cost;
	private Air_Port airports__pos;
	public static TreeSet<Route> routes = new TreeSet<Route>(new RouteComparator());
	

/** 
 *
 * It is a constructor. 
 *
 * @param route  the route
 * @param cost  the cost
 * @param airports__pos  the airports__pos
 */
	public Route(ArrayList<State> route, double cost, Air_Port airports__pos) { 

		this.route = route;
		this.cost = cost;
		this.airports__pos = airports__pos;
	}


	/**
	 * @return the route
	 */
	public ArrayList<State> getRoute() { 

		return route;
	}


	/**
	 * @param route the route to set
	 */
	public void setRoute(ArrayList<State> route) { 

		this.route = route;
	}


	/**
	 * @return the cost
	 */
	public double getCost() { 

		return cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) { 

		this.cost = cost;
	}


	/**
	 * @return the airports__pos
	 */
	public Air_Port getAir_Port() { 

		return airports__pos;
	}


	/**
	 * @param airports__pos the airports__pos to set
	 */
	public void setAir_Port(Air_Port airports__pos) { 

		this.airports__pos = airports__pos;
	}
	
	
	
	
}
