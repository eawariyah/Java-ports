package Individual_Project;

import java.util.ArrayList;


 /**
 * The class X_test
 */ 
public class X_test {

	private double long_value;
	static ArrayList<X_test> X_tests = new ArrayList<X_test>();


/** 
 *
 * It is a constructor. 
 *
 * @param long_value  the long_value
 */
	public X_test(double long_value) { 

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
