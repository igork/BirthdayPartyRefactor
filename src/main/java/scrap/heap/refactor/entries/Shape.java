package scrap.heap.refactor.entries;

public enum Shape {
	
	//TODO: placeholder for other values 
	Circle("Circle"),
	Square("Square"),
	Anything("Anything");
	
	private String value;
	
	private Shape(String value) {
		if (value==null || value.isEmpty()) {
			this.value = "Anything";
		} else {
			this.value = value;
		}
	}


	public String getValue() {
	    return value;
	}

	@Override
	public String toString() {
	   return this.getValue();
	}

	public static Shape getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return Shape.Anything;
		
		for(Shape v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong Shape value " + value);
	}

}
