package scrap.heap.refactor.entries;

public class Cake extends ItemToOrder {
	
	private FrostingFlavor frostingFlavor = FrostingFlavor.Anything;
	private Flavor flavor = Flavor.Anything;
	private Shape shape = Shape.Anything;
	private Size size = Size.Anything;
	private CakeColor cakeColor = CakeColor.Anything;
	
	public Cake( FrostingFlavor frostingFlavor,
			Flavor flavor,
			Shape shape,
			Size size,
			CakeColor cakeColor) {
		
		setFrostingFlavor(frostingFlavor);
		setFlavor(flavor);
		setShape(shape);
		setSize(size);
		setCakeColor(cakeColor);
		
	}
	
	@Override
    public String toString() {
        return "Cake ordered: " + 
        		frostingFlavor.getValue() + 
        		", " +
        		flavor.getValue() + 
        		" ," +
        		shape.getValue() + 
        		", " +
        		size.getValue() + 
        		", " +
        		cakeColor.getValue()
        		;
    }


    @Override
    public boolean equals(Object obj) {

    	if (this == obj) {
            return true;
        }

        if (!(obj instanceof Cake)) {
            return false;
        }

        Cake cake2 = (Cake) obj;
        if (!frostingFlavor.equals(cake2.frostingFlavor)) {
            return false;
        }
        if (!flavor.equals(cake2.flavor)) {
            return false;
        }
        if (!shape.equals(cake2.shape)) {
            return false;
        }
        if (!size.equals(cake2.size)) {
            return false;
        }
        if (!cakeColor.equals(cake2.cakeColor)) {
            return false;
        }


        return true;
    }

	public FrostingFlavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public void setFrostingFlavor(FrostingFlavor frostingFlavor) {
		if (frostingFlavor!=null)
			this.frostingFlavor = frostingFlavor;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		if (flavor!=null)
			this.flavor = flavor;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		if (shape!=null)
			this.shape = shape;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		if (size!=null)
			this.size = size;
	}

	public CakeColor getCakeColor() {
		return cakeColor;
	}

	public void setCakeColor(CakeColor cakeColor) {
		if (cakeColor!=null)
			this.cakeColor = cakeColor;
	}

}
