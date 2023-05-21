package cleaningCarpet;

public class Product {
	
	String Name;
	int Price;
	int Size;
	String Material;


	public Product(String name, Integer price, Integer size, String material) {
		Name=name;
		Price=price;
		Size=size;
		Material=material;
	}
	
	public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
    
    public int getName() {
        return Price;
    }

    public void setPrice(String name) {
        this.Name = name;
    }

}
