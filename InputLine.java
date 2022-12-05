package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Input line
 */ 
public class InputLine {

	private String city;
	private String country;
	static ArrayList<InputLine> inputLines = new ArrayList<InputLine>();


/** 
 *
 * It is a constructor. 
 *
 * @param city  the city
 * @param country  the country
 */
	public InputLine(String city, String country) { 

		this.city = city;
		this.country = country;
	}


/** 
 *
 * Gets the city
 *
 * @return the city
 */
	public String getCity() { 

		return city;
	}


/** 
 *
 * Sets the city
 *
 * @param city  the city
 */
	public void setCity(String city) { 

		this.city = city;
	}


/** 
 *
 * Gets the country
 *
 * @return the country
 */
	public String getCountry() { 

		return country;
	}


/** 
 *
 * Sets the country
 *
 * @param country  the country
 */
	public void setCountry(String country) { 

		this.country = country;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return city+ ", " + country;
	}
	
}
