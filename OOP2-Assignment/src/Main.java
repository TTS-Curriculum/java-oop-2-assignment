
public class Main {
	

	

	public static void main(String[] args) {
		
		// New mobile phone object
		MobilePhone iphone=new MobilePhone("Iphone","15plus","12345678",50);
		
		//Call makecall method using new mobile phone object
		iphone.makeCall("308978963");
		
		//Install app with new object
		iphone.installApp("Solidwork");
		
		//Display myphone information 
		iphone.displayInfo();

	}

}
