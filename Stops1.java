package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Stops1
 */ 
public class Stops1 {

	private String loc_1;
	private String loc_2;
	static ArrayList<Stops1> stops1 = new ArrayList<Stops1>();


/** 
 *
 * It is a constructor. 
 *
 * @param loc_1  the loc_1
 */
	public Stops1(String loc_1) { 

		this.loc_1 = loc_1;	
	}



/** 
 *
 * Getloc_1
 *
 * @return the loc_1
 */
	public String getloc_1() { 

		return loc_1;
	}


/** 
 *
 * Setloc_1
 *
 * @param loc_1  the loc_1
 */
	public void setloc_1(String loc_1) { 

		this.loc_1 = loc_1;
	}
	

/** 
 *
 * Getloc_2
 *
 * @return the loc_2
 */
	public String getloc_2() { 

		return loc_2;
	}


/** 
 *
 * Setloc_2
 *
 * @param loc_1  the loc_1
 */
	public void setloc_2(String loc_1) { 

		this.loc_1 = loc_2;
	}


	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return loc_1;
	}

	

}
