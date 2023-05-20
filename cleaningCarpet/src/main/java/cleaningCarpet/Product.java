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
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public void setMaterial(String material) {
        this.Material = material;
    }
    public String getMaterial() {
        return Material;
    } 

}
