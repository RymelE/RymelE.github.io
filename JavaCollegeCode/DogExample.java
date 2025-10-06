/**
 * DogExample contains a main method to test the Dog class constructors and methods
 */
public class DogExample {
	public static void main(String[] args) {
		
		//TODO: Create a third dog named Woofster who is wagging their tail and like baths
        Dog dog1 = new Dog("Snuggles", true, false); 
        Dog dog2 = new Dog("Fido", false, true);
        Dog dog3 = new Dog("Woofster", true, true);
        //TODO: Print initial state of all 3 dogs
        System.out.println("After creating new dogs:");
        dog1.printState();
        dog2.printState();
        dog3.printState();
        //TODO: Give all 3 dogs a bath
       dog1.giveBath();
       dog2.giveBath();
       dog3.giveBath();
        
        //TODO: Print final state of all 3 dogs
        System.out.println("After baths:");
        dog1.printState();
        dog2.printState();
        dog3.printState();
    }
}

/**
 * Dog class demonstrates fields, constructors, and methods
 */
class Dog {

    // Instance variables/fields
     private String name;   
     private boolean isWaggingTail;
     private boolean likesBaths;
     
     //Constructor
     public Dog(String newName, boolean newIsWaggingTail, boolean newLikesBaths) {
         name = newName;
         isWaggingTail = newIsWaggingTail;
         likesBaths = newLikesBaths;
     }
     
     public void printState() {
    	 System.out.println(name + " is wagging: " + isWaggingTail + ", likes baths: " + likesBaths);
     }
     
     //TODO: Implement giveBath method to assign isWaggingTail to likesBaths
     public void giveBath() {
    	 if(likesBaths == true) {
    		 isWaggingTail = true;
    	 }
    	 else {
    		 isWaggingTail = false;
    	 }
     }
     
}
