package scrap.heap.refactor.entries;

public enum Size {
	
	//TODO: placeholder for other values 
	Large("Large"),
	Med("Med"),
	Small("Small"),
	Anything("Anything");
	
	private String value;
	
	private Size(String value) {
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

	public static Size getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return Size.Anything;
		for(Size v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong Size value \" + value");
	}

}
