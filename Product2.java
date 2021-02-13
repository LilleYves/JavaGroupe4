public class ProductItem
{
	// Instance Variables hich has fields *String name, double price, and int quantity*
  	String name;
    double price;
    int quantity;

	// Constructor Declaration of Class
	public ProductItem(String name, double price,
				int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Method 1: returns the total price of the order of that product.

	public double totalPrice()
	{
		return price * quantity;
	}
  // method 2 
//
 public void increasePrice() {
        this.price = this.price + 1;
    }

    public String toString() {

        String s = "";

        s = s + this.price + ": " + this.price;

        return s;
    }

}