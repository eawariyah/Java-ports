package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Stops
 */ 
public class Stops {

	private String ICAO_value;
	static ArrayList<Stops> cities4 = new ArrayList<Stops>();


/** 
 *
 * It is a constructor. 
 *
 * @param ICAO_value  the  ICA o_value
 */
	public Stops(String ICAO_value) { 

		this.ICAO_value = ICAO_value;		
	}



/** 
 *
 * Gets the ICA o_value
 *
 * @return the  ICA o_value
 */
	public String getICAO_value() { 

		return ICAO_value;
	}


/** 
 *
 * Sets the ICA o_value
 *
 * @param ICAO_value  the  ICA o_value
 */
	public void setICAO_value(String ICAO_value) { 

		this.ICAO_value = ICAO_value;
	}


	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return ICAO_value;
	}

	

}
