
public class CartItem implements Item{
	
	private String name;
	private double price;
	
	/**
	 * Constructs an item with a specific name and price
	 * @parm name The name of the item
	 * @parm price The price of the item
	 */
	public CartItem(String name, double price) {
		this.name = name;
		this.price = price;
	} //end constructor
	
	/**
	 * get the name of the item
	 * @return the name of the item
	 */
	String getName() {
		return name;
	} //end getName
	
	/**
	 * get price of the item
	 * @return the price of the number
	 */
	double getPrice() {
		return price;
	} //end getPrice
	
	/**
	 * @return A string that represents the item
	 */
	
	@Override
	public String toString() {
		return "Item name: " + name + "Item price: " + price;
	} //end toString

} //end CartItem
