package scrap.heap.refactor.entries;

import java.util.List;

public class Order {
	
	private List<ItemToOrder> item;

	//TODO: 
	//placeholder for order attributes and methods like 
	//DateTime of order, 
	//DateTime of delivery,
	//ShippingAddress
	//Payment and so on
	
	public Order(List<ItemToOrder> item) {
		this.item = item;
	}

	public List<ItemToOrder> getItem() {
		return item;
	}
}
