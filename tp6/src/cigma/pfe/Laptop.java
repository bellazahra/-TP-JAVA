package cigma.pfe;

public class Laptop {
	
	double price;
	public Laptop(double price) {
	this.price = price;
	}
	@Override
	public String toString() {
	return "Laptop{" +
	"price=" + price +
	'}';
	}
	
	@Override
	
	public int hashCode() {
	return (""+this.price).length();
	}
	@Override
	
	public boolean equals(Object o) {
	return this.price==((Laptop)o).price;
	}


}
