package scrap.heap.refactor.entries;

public enum CakeColor {
	
	//TODO: placeholder for other values 
	Brown("Brown"),
	Yelllow("Yellow"),
	Anything("Anything");;
	
	private String value;
	
	private CakeColor(String value) {
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

	public static CakeColor getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return CakeColor.Anything;
		for(CakeColor v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong CakeColor value " + value);
	}

}
