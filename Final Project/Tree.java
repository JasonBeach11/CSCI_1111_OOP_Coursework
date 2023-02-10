public class Tree {

	// Physical characteristics shared by all trees
	private String commonName = "General Tree";				// Common Name
	private String scientificName = "Scientific Name";		// Scientific Name
	private String trivia = "General Trivia";				// Trivia / fun fact about specific tree
	
	
	/** Construct default Tree object */
	public Tree() {
	}
	
	
	/** Construct Tree object with Common Name and Scientific Name as parameters*/
	public Tree(String common, String scientific) {
		this.commonName = common;
		this.scientificName = scientific;
	}
	
	
	/** Set Common Name */
	public void setCommonName(String name) {
		this.commonName = name;
	}
	
	
	/** Set Scientific Name */
	public void setScientificName(String name) {
		this.scientificName = name;
	}
	
	
	/** Get Common Name */
	public String getCommonName() {
		return commonName;
	}
	
	
	/** Get Scientific Name */
	public String getScientificName() {
		return scientificName;
	}
	
	
	/** Set trivia */
	public void setTrivia(String trivia) {
		this.trivia = trivia;
	}
	
	
	/** Get trivia */
	public String getTrivia() {
		return trivia;
	}
	
	
	/** Output all tree info as a string */
	public String toString() {
		return ("Common Name: " + getCommonName() + "\nScientific Name: " + getScientificName() + 
				"\nInteresting Fact: " + getTrivia());
	}
	
} // End Tree Object Class
