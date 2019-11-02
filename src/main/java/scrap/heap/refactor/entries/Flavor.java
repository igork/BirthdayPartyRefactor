package scrap.heap.refactor.entries;

public enum Flavor {
	
	//TODO: placeholder for other values 
	Chocolate("Chocolate"),
	Vanilla("Vanilla"),
	Anything("Anything");;
	
	private String value;
	
	private Flavor(String value) {
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

	public static Flavor getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return Flavor.Anything;
		for(Flavor v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong Flavor value " + value);
	}

}
