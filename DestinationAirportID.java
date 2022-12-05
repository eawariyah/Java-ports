package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Destination airport I D
 */ 
public class DestinationAirportID {

	private String ICAO_value;
	static ArrayList<DestinationAirportID> cities3 = new ArrayList<DestinationAirportID>();


/** 
 *
 * It is a constructor. 
 *
 * @param ICAO_value  the  ICA o_value
 */
	public DestinationAirportID(String ICAO_value) { 

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
