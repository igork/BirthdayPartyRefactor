package scrap.heap.refactor.entries;

public class Balloon extends ItemToOrder {
	
	private BalloonColor color = BalloonColor.Anything;
	private Material material = Material.Anything;
	
	public Balloon(BalloonColor color, Material material) {

		setColor (color);
		setMaterial(material); 
	}
	
	@Override
    public String toString() {
        return "Balloon ordered: " + 
        		color.getValue() + 
        		", " +
        		material.getValue()
        		;
    }


    @Override
    public boolean equals(Object obj) {

    	if (this == obj) {
            return true;
        }

        if (!(obj instanceof Balloon)) {
            return false;
        }

        Balloon balloon2 = (Balloon) obj;
        if (!color.equals(balloon2.color)) {
            return false;
        }

        if (!material.equals(balloon2.material)) {
            return false;
        }
        return true;
    }

	public BalloonColor getColor() {
		return color;
	}

	public void setColor(BalloonColor color) {
		if (color!=null) {
			this.color = color;
		}
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		if (material!=null) {
			this.material = material;
		}
	}

}
