package Individual_Project;

import java.util.ArrayList;


 /**
 * The class Y_test
 */ 
public class Y_test {

	private double long_value;
	static ArrayList<Y_test> Y_tests = new ArrayList<Y_test>();


/** 
 *
 * It is a constructor. 
 *
 * @param long_value  the long_value
 */
	public Y_test(double long_value) { 

		this.long_value = long_value;		
	}


/** 
 *
 * Getlong_value
 *
 * @return the long_value
 */
	public double getlong_value() { 

		return long_value;
	}


/** 
 *
 * Setlong_value
 *
 * @param long_value  the long_value
 */
	public void setlong_value(double long_value) { 

		this.long_value = long_value;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		double initial = long_value;
		String final_string=String.valueOf(initial);  
		return final_string;
	}

	

}
