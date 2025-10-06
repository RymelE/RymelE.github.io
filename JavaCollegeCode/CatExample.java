/**
 * CatExample contains a main method to test the Cat class constructors and methods
 */
public class CatExample {
	public static void main(String[] args) {
		Cat cat1 = new Cat(); 					//Constructor #1, no-args.
		Cat cat2 = new Cat("Meowster", true);   // Constructor #2

		System.out.println(cat1.getName() + " is purring: " + cat1.isPurring()); 
		System.out.println(cat2.getName() + " is purring: " + cat2.isPurring()); 
		
		System.out.println("Giving " + cat1.getName() + " a treat");
		cat1.giveTreat();  
		
		System.out.println("Grooming " + cat2.getName());
		//TODO: add method call to groom cat2
		cat2.groom();
		
		System.out.println(cat1.getName() + " is purring: " + cat1.isPurring()); 
		System.out.println(cat2.getName() + " is purring: " + cat2.isPurring()); 
		
	}
}

/**
 * Cat class demonstrates constructors, fields, and methods
 */
class Cat {

	// Instance variables/fields
	private String name;   
	private boolean isPurring;

	//Constructor #1 (no-args). Fields are initialized to default values.
	public Cat() { 
		name = "Whiskers"; 
	}

	//Constructor #2. Fields are initialized to parameter values.
	public Cat(String newName, boolean newIsPurring) {
		name = newName;
		isPurring = newIsPurring;
	}

	//Getter methods
	public String getName() { return name; }
	public boolean isPurring() { return isPurring; }
	
	//giveTreat - assign isPurring to true
    public void giveTreat() { isPurring = true; }

	//TODO: Implement groom method to assign isPurring to false
	public void groom() { isPurring = false;}

}

