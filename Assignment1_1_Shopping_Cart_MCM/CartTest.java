/**
 * This class will test the Shopping Cart.
 * @author Matt
 *
 */
public class CartTest {

	public static void main(String[] args) {
		
		ShoppingCart<Item> shoppingCart = new ShoppingCart<>();
		
		Item item1 = new Item("SkateBoard", 49.99, 1);
		Item item2 = new Item("Shoes", 59.09, 1);
		Item item3 = new Item("Tee Shirt", 12.99, 1);
		Item item4 = new Item("NoteBook", 5.49, 1);
		Item item5 = new Item("Glasses", 10.64, 1);
		Item item6 = new Item("Shoes", 80.35, 1);
		
		/**
		 * This tests if the cart is empty before adding items.
		 */
		System.out.println(shoppingCart.isEmpty());
		System.out.println();
		
		/**
		 * This adds the items to the shopping cart.
		 */
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
		shoppingCart.addItem(item4);
		shoppingCart.addItem(item5);
		shoppingCart.addItem(item6);
		
		/**
		 * This tests if the cart is empty after adding items.
		 */
		System.out.println(shoppingCart.isEmpty());
		System.out.println();
		
		/**
		 * This will display all the items added to the cart.
		 */
		shoppingCart.displayCart();
		System.out.println();
		
		/**
		 * This will get the current size of the cart and also display the total price of all items.
		 */
		int cartSize = shoppingCart.getCartSize();
		System.out.println("Current size of the shopping cart is: " + cartSize);
		System.out.println();

		/**
		 * This removes an item from the cart.
		 */
		shoppingCart.removeItem(item2);
		
		/**
		 * This displays the cart after removing an item with new total price.
		 */
		shoppingCart.displayCart();
		System.out.println();
		System.out.println();
		
		/**
		 * This will clear the entire cart.
		 */
		shoppingCart.clearCart();
		shoppingCart.displayCart();
		System.out.println();
		
		/**
		 * This will add the items back to the cart
		 */
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
		shoppingCart.addItem(item4);
		shoppingCart.addItem(item5);
		shoppingCart.addItem(item6);
		System.out.println();
		
		/**
		 * This will get the total price of all items in the cart.
		 */
		shoppingCart.getTotalPrice();
		System.out.println();

		/**
		 * This will get the frequency of an item in the cart.
		 */
		System.out.println(shoppingCart.getFrequancyOf(item3));
		System.out.println();

		/**
		 * This will check if the cart contains a specific item.
		 */
		System.out.println(shoppingCart.contains(item4));
		
	}//end main

}//end class
