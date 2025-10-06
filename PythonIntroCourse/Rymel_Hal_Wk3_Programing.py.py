"""
1. Name: Hal Rymel
2. 5/26/2025
3. Week 3 Assignment 2: Programming Assignment / Movie Price Calculator
4. Version 1.0
Description: Description:
This program calculates the final movie ticket price based on the user's age 
and movie showtime. It applies discounts for seniors and children and for 
matinee show times (before 5:00 PM), then calculates tax and displays the final price.
"""

# Input user age with validation
while True:
    user_input = input("Please enter your age in years: ")
    if user_input.isdigit():
        age = int(user_input)
        break
    else:
        print("Please enter a valid number.")

# Input movie time in 24-hour format (e.g. 1700)
while True:
    user_input = input("Please enter the show-time in 24-hour format (e.g. 1700 for 5:00 PM): ")
    if user_input.isdigit():
        time = int(user_input)
        break
    else:
        print("Please enter a valid number.")

# Determine base price based on age
if age <= 12:
    price = 10.99
elif age >= 60:
    price = 15.99
else:
    price = 18.99

# Apply matinee discount if before 5:00 PM
if time < 1700:
    discount = price * 0.15
else:
    discount = 0

# Calculate discounted price, tax, and final price
discount_price = price - discount
tax = discount_price * 0.08
final_price = float(discount_price + tax)

# Display results
print("--------------------------------")
print(f"Your base ticket price = ${price:.2f}")
print(f"Discount applied = ${discount:.2f}")
print(f"Tax = ${tax:.2f}")
print(f"Your final ticket price = ${final_price:.2f}")
