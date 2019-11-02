package scrap.heap.refactor.entries;

public enum BalloonColor {
	
	//TODO: placeholder for other values 
	Red("Red"),
	Blue("Blue"),
	Yelllow("Yellow"),
	Anything("Anything");
	
	private String value;
	
	private BalloonColor(String value) {
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

	public static BalloonColor getEnum(String value) throws IllegalArgumentException {
		if(value==null || value.isEmpty())
			return BalloonColor.Anything;
		for(BalloonColor v : values())
			if(v.getValue().equalsIgnoreCase(value)) return v;
	        	throw new IllegalArgumentException("Wrong BalloonColor value " + value);
	}

}
