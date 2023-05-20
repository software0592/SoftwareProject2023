package cleaningCarpet;

public class Customer {
	
	String ID;
	String Name;
	String Phone;
	String Address;
	
	public Customer() {
		System.out.println();
	}
	
	public Customer(String id,String name,String phone,String address) {
		ID=id;
		Name=name;
		Phone=phone;
		Address=address;
	}
	public String getId() {
        return ID;
    }
    
    public void setId(String id) {
        this.ID = id;
    }
    
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        this.Name = name;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setPhone(String phone) {
        this.Phone = phone;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String address) {
        this.Address = address;
    }
}
