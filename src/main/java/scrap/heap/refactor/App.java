package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

import scrap.heap.refactor.entries.Balloon;
import scrap.heap.refactor.entries.BalloonColor;
import scrap.heap.refactor.entries.Cake;
import scrap.heap.refactor.entries.CakeColor;
import scrap.heap.refactor.entries.Flavor;
import scrap.heap.refactor.entries.FrostingFlavor;
import scrap.heap.refactor.entries.ItemToOrder;
import scrap.heap.refactor.entries.Material;
import scrap.heap.refactor.entries.Order;
import scrap.heap.refactor.entries.Shape;
import scrap.heap.refactor.entries.Size;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

         //Place birthday party orders
         order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
         order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
         order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );

    }

    /*
    private static void order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        orderBalloons(balloonColor, material, number);

        orderCake(frostingFlavor, flavor, shape, size, cakeColor);
    }

    private static void orderBalloons(String balloonColor, String material, String number){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material  + ", " + number);

    }

    private static void orderCake(String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor);

    }
    
    */
    
    /*
     *  check values for all parameters against restriction
     *  create Order 
     */
    
    public static Order order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){
    	
    	List<ItemToOrder> list = new ArrayList<ItemToOrder>();
    	
    	int numOfBalloons = 0;
    	int numOfCakes = 0;
    	

    		
    		try {
				numOfBalloons = Integer.parseInt(number);
  	
				for(int i=0; i<numOfBalloons; i++) {
					//balloons
					Balloon balloon = new Balloon(BalloonColor.getEnum(balloonColor),Material.getEnum(material));
					list.add(balloon);
					System.out.println(balloon.toString());
				}
  	
				//cakes
				Cake cake = new Cake(FrostingFlavor.getEnum(frostingFlavor),Flavor.getEnum(flavor),Shape.getEnum(shape),Size.getEnum(size),CakeColor.getEnum(cakeColor));
				list.add(cake);
				System.out.println(cake.toString());
  	
				return order(list);
				
			} catch (NumberFormatException e) {

				System.out.println("\nWRONG BALLONS NUMBER " + number + "\n");
				
			} catch (IllegalArgumentException e) {
				
				System.out.println("\nUNSUPPORTED ATTRBUTE VALUE " + e.getMessage() + "\n");
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
    	
    		return null;
    	
    	
    }
    
    /*
     * allow wider set of balloons variations and ordering of multiple cakes 
     *  
     */
    public static Order order(List<ItemToOrder> item){
    	
    	return new Order(item);
    	
    }

}
