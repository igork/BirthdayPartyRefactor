package scrap.heap.refactor.entries;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import scrap.heap.refactor.App;

public class OrderTest {

	@Test
	public void test() {
	   	Order order1 = App.order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
        assertNotNull("should return order", order1);
    	
    	Order order2 = App.order("reD", "mYlar", "4", "chOcolate", "chocolatE", "cIrcle", "Large", "browN" );
        assertNotNull("should return order", order2);
        
        Order order3 = App.order("blue", "latex", "7", "Vanilla", "chocolate", "square", "med", "brown" );
             
        assertEquals(order1.getItem(),order2.getItem());
        assertNotEquals(order1.getItem(),order3.getItem());

        //wrong "chocelate" value
        Order order4 = App.order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
        assertNull(order4);
        
        Order order5 = App.order(null);
        assertNull(order5.getItem());
        
        
        
        //check that both methods returns the same output;
        Balloon balloon = new Balloon(BalloonColor.Red,Material.Mylar);
        Cake cake = new Cake(FrostingFlavor.Chocolate,Flavor.Chocolate,Shape.Circle,Size.Large,CakeColor.Brown);
    	List<ItemToOrder> list = new ArrayList<ItemToOrder>();
    	list.add(balloon);
    	list.add(balloon);
    	list.add(balloon);
    	list.add(balloon);
    	list.add(cake);
    	
        Order order100 = App.order(list);
        assertEquals(order1.getItem(),order100.getItem());
	}

}
