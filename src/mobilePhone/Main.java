package mobilePhone;

public class Main {
    public static void main(String[] args) {
    	
        // Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone (Brand, Model, Phone Number, and Storage Capacity)
        MobilePhone myPhone = new MobilePhone("Samsung", "Galaxy S21", "(123)567-9309", 128);
        
        // Call the makeCall() method using your phone object - remember to pass it a phone number as input!
        myPhone.makeCall("1234567890");
        
        // Call the installApp() method using your phone object - remember to pass it an app name as input!
        myPhone.installApp("Facebook");
        
        // Display your phones information using the displayInfo() method!
        myPhone.displayInfo();
    }
}
