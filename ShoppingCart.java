
public interface ShoppingCart {
	
	
	/**
	 * add an item to the shopping cart
	 * @param item The item is added to the cart
	 */
	void addItem (Item item);
		
	/**
	 * 
	 * @param item The item is removed from cart
	 * @return true - it was removed successfully || false - it was not removed
	 * remove an item from the shopping cart
	 */
	boolean removeItem (Item item); 
	
	/**
	 * @return number of items currently in your cart
	 */
	int getNumberOfItems();
		
	/**
	 * Displays current contents of the cart
	 */
	void showCartContents();
	
	/**
	 * calculate the total price of items in the cart
	 * @return the total cost of cart items
	 */
	double getTotalPrice();
	
	/**
	 * clear the cart from all items
	 */
	void clearCart();
	
	

} //end ShoppingCart
