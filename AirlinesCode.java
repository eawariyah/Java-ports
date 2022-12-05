package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Airlines code
 */ 
public class AirlinesCode {

	private String ID_name;
	static ArrayList<AirlinesCode> AirlinesCodes = new ArrayList<AirlinesCode>();


/** 
 *
 * It is a constructor. 
 *
 * @param ID_name  the  I d_name
 */
	public AirlinesCode(String ID_name) { 

		this.ID_name = ID_name;		
	}



/** 
 *
 * Gets the I d_name
 *
 * @return the  I d_name
 */
	public String getID_name() { 

		return ID_name;
	}


/** 
 *
 * Sets the I d_name
 *
 * @param ID_name  the  I d_name
 */
	public void setID_name(String ID_name) { 

		this.ID_name = ID_name;
	}


	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return ID_name;
	}

	

}
