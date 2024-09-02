
public class ShoppingCartTest {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCartClass();
		
		System.out.println("Welcome to Megan's Market. Add items to your bag.")
		
		Item item1 = new CartItem("Honey Crisp Apple", 1.39);
		Item item2 = new CartItem("Goldfish Crackers", 3.99);
		Item item3 = new CartItem("Chaboni Greek Yogurt", 2.35);
		
		//Test CartItem 
		System.out.println("The first item in your cart is: " + item1.toString());
		System.out.println("The second item in your cart is: " + item2.toString());
		System.out.println("The third item in your cart is: " + item3.toString());

		//Test ShoppingCartClass
		
		//Test addItems
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		
		
		//Test getNumberOfItems
		System.out.println("The are " + cart.getNumberofItem()s + " items in your cart");
		
		//Test showCartContents
		System.out.println("The contents in your cart are: ");
		cart.showCartContents();
		
		//Test getTotalPrice
		System.out.println("The total price of your cart is: $" + cart.getTotalPrice());
		
		//Test remove item
		System.out,println("Removing Goldfish Crackers from your cart.");
		cart.removeItem(item2);
		System.out.println("The items in your cart are now: ");
		cart.showCartContents();
		System.out.println("The new total of your cart is: $" + cart.getTotalPrice() + ". Thank you for paying.");
		
		//Test ClearCart
		cart.clearCart();
		System.out.println("Thank you for shopping at Megan's Market. You now have " + cart.showCartContents() + "items in your bag.");
		

	} //end main

} //end ShoppingCartTest
