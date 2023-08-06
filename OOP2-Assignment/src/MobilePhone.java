
class MobilePhone {
	
	//Instance Variables 
	private String brand;
	private String model;
	private String phoneNumber;
	private double storageCapacity;
	
	//public constructor for all Instance variables
	public MobilePhone(String brand,String model,String phoneNumber, double storageCapacity) {
		
		this.brand=brand;
		this.model=model;
		this.phoneNumber=phoneNumber;
		this.storageCapacity=storageCapacity;
	}
	
	//Setter  and getter methods for private Instance variables
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(double storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	// makeCall method to notify user of phone-number and phone information
	public void makeCall ( String phoneNumber) {
		System.out.println("We are calling "+phoneNumber+ " from " +brand+model+ " phone ");
		 
	}
	//Install-app method to notify 
	public void installApp(String appName) {
		System.out.println("Installing " +appName+ " on our " +brand + model+ " phone! ");
		}
	
	//DisplayInfo method to notify user for input 
	
	public void displayInfo() {
		System.out.println("Brand:"+brand+"\nModel:"+model+"\nPhone Number:"+phoneNumber+"\nStorage Capacity:"+storageCapacity);
	}

}
