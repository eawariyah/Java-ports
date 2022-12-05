package Individual_Project;

import java.util.Objects;

/**
 * A class representing a path_movt using its unique id and its name if given.
*/
public class Path_movt {
	private int path_movtId;
	private String path_movtName;
	/**
	 * @param path_movtId
	 * @param path_movtName
	 */
	public Path_movt(int path_movtId, String path_movtName) { 

		this.path_movtId = path_movtId;
		this.path_movtName = path_movtName;
	}
	
	/**
	 * In case there is not a name available for the 
	 * path_movt this constructor is called.
	 * @param k
	 */
	public Path_movt(int k) { 

		this.path_movtId = k;
		this.path_movtName = "None";
//		txtWriter.name_id(path_movt.getPath_movtName());

	}

	/**
	 * @return the path_movtId
	 */
	public int getPath_movtId() { 

		return path_movtId;
	}
	
	/**
	 * @param path_movtId is the id of the path_movt to set
	 */
	public void setPath_movtId(int path_movtId) { 

		this.path_movtId = path_movtId;
	}
	
	/**
	 * @return the path_movtName
	 */
	public String getPath_movtName() { 

		return path_movtName;
	}
	/**
	 * @param path_movtName is the name of the path_movt to set
	 */
	public void setPath_movtName(String path_movtName) { 

		this.path_movtName = path_movtName;
	}

	@Override

/** 
 *
 * To string
 *
 * @return String
 */
	public String toString() { 

		return "Path_movt with path_movtId = " + path_movtId + " path_movtName = " + path_movtName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override

/** 
 *
 * Hash code
 *
 * @return int
 */
	public int hashCode() { 

		return Objects.hash(path_movtId, path_movtName);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override

/** 
 *
 * Equals
 *
 * @param obj  the obj
 * @return boolean
 */
	public boolean equals(Object obj) { 

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Path_movt other = (Path_movt) obj;
		return path_movtId == other.path_movtId && Objects.equals(path_movtName, other.path_movtName);
	}
	
	
	
}
