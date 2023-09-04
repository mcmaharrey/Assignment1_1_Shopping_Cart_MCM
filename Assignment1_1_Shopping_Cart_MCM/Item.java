/**
 * This is the class of Items that will be added to the shopping cart.
 * @author Matt
 *
 */
public class Item {

	private String name;
	private double price;
	private int quantity;
	
	public Item(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item: " + name + "(Price: " + price + ")";
	}
	
	
}//end class
