
/**
 * A class of a shopping cart that uses an ArrayBag to manage the items stored inside.
 * @author Matt
 *
 * @param <T> The type of item(s) to be stored in the shopping cart.
 */
public class ShoppingCart<T extends Item> {

	private ArrayBag<T> cart;
	
	/**
	 * Creates a new shopping cart.
	 */
	public ShoppingCart() {
		
		cart = new ArrayBag<T>();
		
	}//end default constructor
	
	/**
	 * Adds an item to the shopping cart
	 * @param item The item being added to the cart.
	 * @return Returns true of the item was added to the shopping cart.
	 */
	public boolean addItem(T item) {
		
		return cart.add(item);
		
	}//end addItem
	
	/**
	 * Removes an item from the shopping cart.
	 * @param item The item being removed from the shopping cart.
	 * @return Returns true if the item was removed from the shopping cart.
	 */
	public boolean removeItem(T item) {
		
		return cart.remove(item);
		
	}//end removeItem
	
	/**
	 * Removes all the items from the shopping cart.
	 */
	public void clearCart() {
		cart.clear();
	}//end clearCart
	
	/**
	 * Displays all the contents currently in the shopping cart with their prices.
	 */
	public void displayCart() {
		
		if (cart.isEmpty()) {
			System.out.println("Your shopping cart is empty.");
		} else {
			System.out.println("Contents of the shopping cart:");
			Object[] itemArray = cart.toArray();
			for (Object item : itemArray) {
				System.out.println(item);
			}
		}
		
	}//end displayCart
	
	/**
	 * Adds the total for all items in the shopping cart.
	 * @return Returns the Total price of all items in the shopping cart.
	 */
	public void getTotalPrice() {
		
		double totalPrice = 0.0;

	        for (Object item : cart.toArray()) {
	            totalPrice += ((Item)item).getPrice() * ((Item)item).getQuantity();
	        }  System.out.println("Total price of items in the shopping cart: $" + totalPrice);
		
	}//end totalPrice
	
	/**
	 * Gets the current cart size.
	 * @return The number of items currently in the shopping cart
	 */
	public int getCartSize() {
		
		return cart.getCurrentSize();
		
	}//end cartSize
	
	/**
	 * Gets the frequency of an item in the shopping cart
	 * @param item The item being counted in the array.
	 * @return The number of instances an item appears in the shopping cart.
	 */
	public int getFrequancyOf(T item) {
		
		return cart.getFrequencyOf(item);
		
	}//end getFrequancyOf
	
	/**
	 * Checks if the shopping cart array contains a certain item.
	 * @param item The item being checked for in the array.
	 * @return Returns true if the item was listed in the array.
	 */
	public boolean contains(T item) {
		
		return cart.contains(item);
		
	}//end Contains
	
	/**
	 * Checks for if the shopping cart is empty.
	 * @return true if empty, returns false if not.
	 */
	public boolean isEmpty() {
		
		return cart.isEmpty();
		
	}//end isEmpty

	public ArrayBag<T> getCart() {
		return cart;
	}

	public void setCart(ArrayBag<T> cart) {
		this.cart = cart;
	}
	
}//end class
