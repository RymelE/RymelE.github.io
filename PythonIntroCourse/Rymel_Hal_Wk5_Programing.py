"""
1. Name: Hal Rymel
2. 6/11/2025
3. Week 5 Assignment 2: Programming Assignment / Pizza Ordering Program
4. Version 1.0
Description: This program simulates a pizza ordering system where users can choose a pizza size, select toppings, and specify the quantity. 
It calculates the total cost based on the selections and displays a detailed order summary with input validation for a smooth user experience.
"""

# Function to get the size of the pizza from the user
def get_pizza_size():
    while True:
        # Display size options
        print("1. Small ($12.00)")
        print("2. Medium ($14.00)")
        print("3. Large  ($16.00)")
        try:
            # Prompt user for size selection
            size = int(input("What size would you like? (1, 2, or 3): "))
            # Check if input is valid (1-3)
            if size == 1 or size == 2 or size == 3:
                return size
            else:
                print("Please enter 1, 2, or 3.")
        except ValueError:
            # Handle non-integer input
            print("Please enter a valid number.")

# Function to ask the user for toppings
def get_toppings():
    toppings_count = 0  # Count how many toppings selected
    selected_toppings = []  # List of chosen toppings
    print("Choose your toppings. Toppings cost $1.50 each.\n")

    # List of available toppings
    toppings = ["pepperoni", "sausage", "olives"]

    # Loop through each topping and ask user if they want it
    for topping in toppings:
        while True:
            try:
                choice = int(input(f"Would you like {topping}? (1 for yes, 0 for no): "))
                if choice == 1:
                    selected_toppings.append(topping)  # Add topping to list
                    toppings_count += 1  # Increase count
                    break
                elif choice == 0:
                    break  # No topping selected, move to next
                else:
                    print("Please enter 1 for yes or 0 for no.")
            except ValueError:
                # Handle invalid input
                print("Invalid input. Please enter a number: 1 for yes or 0 for no.")

    return toppings_count, selected_toppings  # Return count and list of selected toppings

# Function to calculate total price
def calculate_price(size, toppings_count, quantity):
    prices = [12.00, 14.00, 16.00]  # Base prices by size: small, medium, large
    base = prices[size - 1]  # Get base price based on size index
    total = (base + float(1.50 * toppings_count)) * quantity  # Calculate total
    return total

# Function to display order summary
def display_order(size, selected_toppings, quantity, total):
    size_names = ["Small", "Medium", "Large"]  # Mapping size numbers to names
    print("Thank you for your order!")
    print("\nOrder Summary:\n")
    # Display summary in sentence form
    print(f"{quantity} {size_names[size - 1]} cheese pizza with {', '.join(selected_toppings)}\n")
    print(f"Your order total is: ${total:.2f}")  # Show total formatted to 2 decimal places

# Main function that runs the full ordering process
def main():
    print("Welcome to the Manny's Pizza! \n")
    print("Choose what size pizza you'd like to order: ")

    size = get_pizza_size()  # Ask for pizza size
    toppings_count, selected_toppings = get_toppings()  # Ask for toppings

    # Ask for quantity with error handling
    while True:
        try:
            quantity = int(input("How many pizzas would you like?: "))
            if quantity > 0:
                break  # Valid quantity entered
            else:
                print("Please enter a number greater than 0.")
        except ValueError:
            print("Invalid input. Please enter a whole number.")

    # Calculate total price
    total = calculate_price(size, toppings_count, quantity)

    # Display final order
    display_order(size, selected_toppings, quantity, total)

# Ensures this code runs only when the script is executed directly
if __name__ == "__main__":
    main()
