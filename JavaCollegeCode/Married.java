public class Married {
    private String firstName;
    private String lastName;

    // Constructor
    public Married(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to update last name after marriage
    public void updateLastName(String newLastName) {
        this.lastName = newLastName;
        System.out.println(firstName + " has changed their last name to " + newLastName + ".");
    }

    // Method to display person info
    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }

    // Main method for testing
    public static void main(String[] args) {
        Married person1 = new Married("Alex", "Johnson");
        person1.printInfo();

        // Simulate marriage and name change
        person1.updateLastName("Williams");
        person1.printInfo();
    }
}
