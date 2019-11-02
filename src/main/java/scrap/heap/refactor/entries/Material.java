package scrap.heap.refactor.entries;

public enum Material {
	
	//TODO: placeholder for other values 
	Mylar("Mylar"),
	Latex("Latex"),
	Anything("Anything");
	
	private String value;
	
	private Material(String value) {
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

	public static Material getEnum(String value) throws IllegalArgumentException{
		if(value==null || value.isEmpty())
			return Material.Anything;
		for(Material v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong Material value " + value);
	}

}
