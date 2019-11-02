package scrap.heap.refactor.entries;

public enum FrostingFlavor {
	
	//TODO: placeholder for other values 
	Chocolate("Chocolate"),
	Vanilla("Vanilla"),
	Anything("Anything");;
	
	private String value;
	
	private FrostingFlavor(String value) {
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

	public static FrostingFlavor getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return FrostingFlavor.Anything;
		for(FrostingFlavor v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong FrostingFlavor value " + value);
	}

}
