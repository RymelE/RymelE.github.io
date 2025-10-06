"""
1. Name: Hal Rymel
2. 6/26/2025
3. Week 7 Assignment 2: Programming Assignment / Movie List 
4. Version 1.0
Description: A simple menu-driven program to manage a list of movie recommendations.
"""
#Initialize the list 
movie_list = []

#defines function to add movie
def add_movie():
    movie = input("Enter a movie name to add: ").strip()
    if movie:  
        movie_list.append(movie)
        print(f'"{movie}" has been added to your list.')
    else:
        print("Invalid input. Movie name cannot be empty.")

#Defines fucntion to display list
def display_list():
    if not movie_list:
        print("The movie list is currently empty.")
    else:
        print("\nMovie Recommendations:")
        for idx, movie in enumerate(movie_list, start=1):
            print(f"{idx}. {movie}")

#Defines function to exit program
def exit_program():
    print("Exiting the program. Goodbye!")
    exit()  

#Main excution
def main():
    print("Welcome to the Movie Recommendations Program!")
    
    #prints a menue of choices on start up
    while True:
        print("\nPlease choose one of the following options:")
        print("1. Add a movie to the list")
        print("2. Display the movie recommendations")
        print("3. Exit")

        #takes in user input and checks if = to 1,2, or 3. 
        user_choice = input("Enter your choice: ").strip()

        if user_choice == '1':
            add_movie()
        elif user_choice == '2':
            display_list()
        elif user_choice == '3':
            exit_program()
        else:
            print("Entry invalid. Please enter 1, 2, or 3.")

if __name__ == "__main__":
    main()
