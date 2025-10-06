"""
1. Name: Hal Rymel
2. 6/26/2025
3. Week 8 Assignment 2: Programming Assignment / Library Book Checkout
4. Version 1.1
Description: A simple library system that allows users to borrow and return books
using a numbered menu. Includes input validation and real-time updates to book lists.
"""

# Initialize lists for available and borrowed books
available_books = ['The Hobbit', 'Brave New World', 'Fahrenheit 451', 'The Catcher in the Rye', 'Jane Eyre']
checked_out_books = []

# Function to display both available and borrowed books
def display_list():
    print("\nAvailable Books:")
    if available_books:
        # Print each book with a number index
        for index, book in enumerate(available_books, start=1):
            print(f"{index}. {book}")
    else:
        print("No available books.")  # Message if list is empty

    print("\nBorrowed Books:")
    if checked_out_books:
        for index, book in enumerate(checked_out_books, start=1):
            print(f"{index}. {book}")
    else:
        print("No borrowed books.")  # Message if no books are checked out
    print("\n" + "-"*40)

# Function to borrow a book by number input
def borrow_a_book():
    if not available_books:
        print("No books available to borrow.")
        return  # Exit function early if no books are left

    # Show available books with numbers
    print("\nAvailable books:")
    for index, book in enumerate(available_books, start=1):
        print(f"{index}. {book}")

    # Prompt user for a number
    try:
        choice = int(input("Enter the book number that you want to borrow: "))
        if 1 <= choice <= len(available_books):
            # Adjust index (since lists are 0-based) and move the book to checked_out_books
            selected_book = available_books.pop(choice - 1)
            checked_out_books.append(selected_book)
            print(f'Thank you, you have borrowed "{selected_book}".')
        else:
            print("Invalid book number. Please choose a number from the list.")
    except ValueError:
        # Catches non-integer inputs (like letters or symbols)
        print("Invalid input. Please enter a valid number.")

    print("\n" + "-"*30)

# Function to return a borrowed book by number input
def return_a_book():
    if not checked_out_books:
        print("No books currently checked out.")
        return  # Exit early if no books are checked out

    # Show borrowed books with numbers
    print("\nBorrowed books:")
    for index, book in enumerate(checked_out_books, start=1):
        print(f"{index}. {book}")

    try:
        choice = int(input("Enter the book number you want to return: "))
        if 1 <= choice <= len(checked_out_books):
            # Move the book back to available_books
            returned_book = checked_out_books.pop(choice - 1)
            available_books.append(returned_book)
            print(f'Thank you for returning "{returned_book}".')
        else:
            print("Invalid book number. Please choose a number from the list.")
    except ValueError:
        print("Invalid input. Please enter a valid number.")

    print("\n" + "-"*30)

# Function to exit the program
def exit_program():
    print("Exiting the program. Goodbye!")
    exit()  # Terminates the script

# Main function controls menu and user interaction loop
def main():
    while True:
        # Display menu options every loop
        print("\nWelcome to the library. Please use the following menu to enter your choice.")
        print("1. Display available and borrowed books")
        print("2. Borrow a book")
        print("3. Return a book")
        print("4. Exit")

        # Get user choice and handle each option
        choice = input("Enter your choice (1-4): ").strip()

        if choice == '1':
            display_list()
        elif choice == '2':
            borrow_a_book()
        elif choice == '3':
            return_a_book()
        elif choice == '4':
            exit_program()
        else:
            # Handles any invalid menu input
            print("Invalid entry. Please enter a number between 1 and 4.")

if __name__ == "__main__":
    main()
