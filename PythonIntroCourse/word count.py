def get_pizza_size():
    while True:
        print("1. Small ($12.00)")
        print("2. Medium ($14.00)")
        print("3. Large  ($16.00)")
        try:
            size = int(input("What size would you like? (1, 2, or 3): "))
            if size == 1 or size == 2 or size == 3:
                return size
            else:
                print("Please enter 1, 2, or 3.")
        except ValueError:
            print("Please enter a valid number.")


def get_toppings():
    toppings_count = 0
    selected_toppings = []
    print("Choose your toppings. Toppings cost $1.50 each.\n")

    toppings = ["pepperoni", "sausage", "olives"]

    for topping in toppings:
        while True:
            try:
                choice = int(input(f"Would you like {topping}? (1 for yes, 0 for no): "))
                if choice == 1:
                    selected_toppings.append(topping)
                    toppings_count += 1
                    break
                elif choice == 0:
                    break
                else:
                    print("Please enter 1 for yes or 0 for no.")
            except ValueError:
                print("Invalid input. Please enter a number: 1 for yes or 0 for no.")

    return toppings_count, selected_toppings


def calculate_price(size, toppings_count, quantity):
    prices = [12.00, 14.00, 16.00]  # index 0 = small, 1 = medium, 2 = large
    base = prices[size - 1]
    total = (base + float(1.50 * toppings_count)) * quantity
    return total

def display_order(size, selected_toppings, quantity, total):
    size_names = ["Small", "Medium", "Large"]
    print("Thank you for your order!")
    print("\nOrder Summary:\n")
    print(f"{quantity} {size_names[size - 1]} cheese pizza with {', '.join(selected_toppings)}\n")
    print(f"Your order total is: ${total:.2f}")
    

def main():
    print("Welcome to the Manny's Pizza! \n")
    print("Choose what size pizza you'd like to order: ")
    size = get_pizza_size()
    toppings_count, selected_toppings = get_toppings()  
    while True:
        try:
            quantity = int(input("How many pizzas would you like?: "))
            if quantity > 0:
                break
            else:
                print("Please enter a number greater than 0.")
        except ValueError:
            print("Invalid input. Please enter a whole number.")
    total = calculate_price(size, toppings_count, quantity)
    display_order(size, selected_toppings, quantity, total)

if __name__ == "__main__":
    main()
