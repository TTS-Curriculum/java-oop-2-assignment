# How to get started:

### Method 1 - Starting from Scratch:

1. Inside of an Eclipse Workspace, create a new Java project and call it whatever you want
2. Press finish and inside of src create 2 new Classes called 'MobilePhone' and 'Main'
3. Inside of 'Main' define a main method
4. Start your assignment

### Method 2 - Clone from Github:

1. Open the Git perspective: In Eclipse, select "Window" -> "Perspective" -> "Open Perspective" -> "Other...". Choose "Git" from the list and click "OK".
2. Clone the repository: Click on the "Clone a Git repository" icon in the Git perspective toolbar.
3. Provide the clone URL: Paste the clone URL of the GitHub project into the "URI" field in the "Clone Git Repository" dialog.
4. Authenticate (if required): Enter your GitHub credentials if prompted.
5. Configure the local destination: Choose a directory for the project's local copy.
6. Select branch or tag (optional): Choose a specific branch or leave it as the default.
7. Import the project: On the "Import Projects" screen, select the repository and click "Next".
8. Choose project import options: Select the project(s) you want to import and customize import options as needed. Click "Finish".
9. Wait for the import process: Eclipse will import the project(s) and display progress in the "Progress" view.
10. Open the imported project(s): The project(s) will be available in the Package Explorer or Project Explorer view in Eclipse.
11. Start your assignment

## The Assignment:
We are going to create a MobilePhone class that defines a series of phone-related fields and methods using our knowledge of Java Object-Oriented-Programming. Then, we are going to create some custom MobilePhone objects in a different class to demonstrate that our custom class is accessible to other files!

### MobilePhone
1. Please create 4 instance variables for our MobilePhone class:
   - Brand
   - Model
   - Phone Number
   - Storage Capacity
- Think about what data types would work best with these fields :)

2. Create a public constructor for our MobilePhone class
   Given 4 pieces of information as input (brand, model, operatingSystem, and storageCapacity),
   Set the instance variables of your object accordingly

3. Create getter and setter methods for each of our instance variables
   Please at least write 1 set of getters/setters by hand. 
   - After you get the hang of it, you can go to: 
        1. `source` (in the top left corner of Eclipse)
        2. `generate getters and setters`
        3. checkmark all of the fields you want getters and setters for
        4. `generate`

4. Lets make a couple custom phone-related methods:
   1. A makeCall method that takes a phone number as a parameter and then prints:
     `We are calling {the input phone number} from our {brand} {model} phone!`
   2. An installApp method that takes an app name String as input and then prints:
     `Installing {input app name} on our {brand} {model} phone!`
   3. Lastly, a displayInfo method that takes no parameters and prints all information about the phone:
    ```
     Brand: {brand}
     Model: {model}
     Phone Number: {phone number}
     Storage Capacity: {storage capacity}GB
    ```

### Main
Inside of your main method, perform the following steps:
1. Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone (Brand, Model, Phone Number, and Storage Capacity)
2. Call the makeCall() method using your phone object - remember to pass it a phone number as input!
3. Call the installApp() method using your phone object - remember to pass it an app name as input!
4. Display your phone's information using the displayInfo() method!
