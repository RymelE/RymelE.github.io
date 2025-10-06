"""
1. Name: Hal Rymel
2. 6/19/2025
3. Week 6 Assignment 2: Programming Assignment / Mad Lib
4. Version 1.0
Description: This program collects words and numbers from the user and uses them to generate
a personalized Mad Lib-style story. The program validates inputs, applies formatting, and
lets the user play multiple times with error handling.
"""

# Function to get a word input from the user (letters only, with validation)
def user_word_input(phrase):
    while True:
        user_word = input(phrase).strip()
        if user_word.isalpha():
            return user_word
        else:
            print("Please enter a valid word (letters only).")

# Function to get a number input from the user (digits only, with validation)
def user_number_input(phrase):
    while True:
        user_number = input(phrase).strip()
        if user_number.isdigit():
            return int(user_number)
        else:
            print("Please enter a valid positive number.")

# Main function that collects input, builds the story, and prints it
def main():
    while True:
        # Collect and format all inputs
        friends_name = user_word_input("Enter a friend's name: ").capitalize()
        adjective = user_word_input("Enter an adjective: ").lower()
        animal = user_word_input("Enter an animal: ").lower()
        pet_name = user_word_input("Enter a pet's name: ").capitalize()
        verb = user_word_input("Enter a verb: ").lower()
        color = user_word_input("Enter a color: ").lower()
        noun = user_word_input("Enter a noun: ").lower()
        silly_adjective = user_word_input("Enter a silly adjective: ").lower()
        creature = user_word_input("Enter a creature: ").lower()
        food = user_word_input("Enter a food: ").lower()
        number_of_pets = user_number_input("Enter the number of pets: ")
        number_of_treats = user_number_input("Enter the number of treats the creature brought: ")

        # Build story
        line1 = f"One day, my friend {friends_name} brought home a very {adjective} {animal} named {pet_name}."
        line2 = f"Every morning, {pet_name} would {verb} around the house wearing a {color} {noun}."
        line3 = f"It was the most {silly_adjective} thing you've ever seen!"
        line4 = f"Then, out of nowhere, a {creature} appeared at our front door and offered {pet_name} {number_of_treats} plates of {food}."
        line5 = f"Our little {pet_name} grew and grew until, booom."
        line6 = f"We now have {number_of_pets} pets living with us!"

        story = f"\n{line1}\n{line2}\n{line3}\n{line4}\n{line5}\n{line6}"

        # Print story
        print("\nHere is your Mad Lib story:")
        print(story)

        # Prompt for replay with error handling
        while True:
            play_again = input("\nWould you like to create another story? (yes or no): ").strip().lower()
            if play_again == "yes":
                break  # Restart the loop
            elif play_again == "no":
                print("\nThanks for playing Mad Libs! Goodbye!")
                return  # Exit the program
            else:
                print("Invalid input. Please type 'yes' or 'no'.")

# Run the program
if __name__ == "__main__":
    main()
