import tkinter as tk
import json 


root = tk.Tk()
#button command to call the id number from the json file
def button_command(pokemon_id):
    print("Whos that Pokemon")
    print({pokemon_id})
    try:
        with open('pokemon.json', 'r', encoding='utf-8') as file:
            data = json.load(file)  # data is a list of dicts

        for pokemon in data:
            if pokemon['id'] == pokemon_id:
                print("id:", pokemon['id'])
                print("name:", pokemon['name']['english'])
                print("type:", pokemon['type'])
                break
        else:
            print(f"Error: no Pokémon with that Pokédex number {pokemon_id}")

    except FileNotFoundError:
        print("Error: 'pokemon.json' file not found.")
    except json.JSONDecodeError:
        print("Error: JSON file is not valid.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")


root.title("Pokemon")

label = tk.Label(root, text="Pokémon Pokedex", font=("Arial", 14))
label.pack(padx=20, pady=20)

# using 1 for a test
button = tk.Button(root, text="Who's that Pokémon?", command=lambda: button_command(1))
button.pack(pady=10)
#to do add blank to type a number for the button to call on
root.mainloop()
