package Individual_Project;

import java.util.ArrayList;


 /**
 * The class City
 */ 
public class City {

	private String IATA_value;
	static ArrayList<City> cities = new ArrayList<City>();


/** 
 *
 * It is a constructor. 
 *
 * @param IATA_value  the  IAT a_value
 */
	public City(String IATA_value) { 

		this.IATA_value = IATA_value;		
	}



/** 
 *
 * Gets the IAT a_value
 *
 * @return the  IAT a_value
 */
	public String getIATA_value() { 

		return IATA_value;
	}


/** 
 *
 * Sets the IAT a_value
 *
 * @param IATA_value  the  IAT a_value
 */
	public void setIATA_value(String IATA_value) { 

		this.IATA_value = IATA_value;
	}


	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return IATA_value;
	}

	

}
