package entities;

public class storage {
	
	public String name;
	public double price;
	public short qtd;
	
	public double totalValueInStock() {
		
		return price * qtd;
	}
	
	public void addProducts(short qtd) {
		
		this.qtd += qtd;
	}
	
	public void removeProducts(short qtd) {
		
		this.qtd -= qtd;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f, ", price)
				+ qtd
				+ " units, Total: $ "
				+ totalValueInStock();
	}

}
