
public class ShoppingCartClass implements ShoppingCart{
	
		private ResizableArrayBag<Item> cartItems;
		
		/**
		 * Constructs an empty shopping cart
		 */
		
		public ShoppingCartClass() {
			cartItems = new ResizableArrayBag<>();
	} //end constuctor
		
		/**
		 * add an item to the shopping cart
		 * @param item The item is added to the cart
		 */
		public void addItem (Item item) {
			cartItems.add(item);
			System.out.println("Added: " + item);
		} //end addItem
		
		/**
		 * 
		 * @param item The item is removed from cart
		 * @return true - it was removed successfully || false - it was not removed
		 * remove an item from the shopping cart
		 */
		public boolean removeItem (Item item) {
			boolean removed = cartItems.remove(item);
			if (removed) {
				System.out.println("Removed: " + item);
			} else {
				System.out.println("Item not found" + item);
			}
			return removed;
		} //end removeItem
		
		/**
		 * @return number of items currently in your cart
		 */
		public int getNumberOfItems() {
			return cartItems.getCurrentSize();
		} //end getNumberOfItems
		
		
		/**
		 * Displays current contents of the cart
		 */
		public void showCartContents() {
			Object[] items = cartItems.toArray();
			for (Object item : items) {
				System.out.println(item);
			}
		} //end showCartContents
		
		/**
		 * calculate the total price of items in the cart
		 * @return the total cost of cart items
		 */
		public double getTotalPrice() {
			double total = 0.0;
			Object[] items = cartItems.toArray();
			for (Object obj : items) {
				Item item = (Item) obj;
				total += item.getPrice();
			}
			return total;
		} //end getTotalPrice
		
		/**
		 * clear the cart from all items
		 */
		public void clearCart() {
			cartItems.clear();
			System.out.println("The cart has been cleared of items.");
		} //end clearCart

} //end ShoppingCartClass
