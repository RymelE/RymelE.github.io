import tkinter as tk
import json 

root = tk.Tk()
root.geometry("800x800")


#button command to call the id number from the json file
def button_command(pokemon_id):
    pokemon_id = int(entry.get())
    try:
        with open('pokemon.json', 'r', encoding='utf-8') as file:
            data = json.load(file)  # data is a list of dicts

        for pokemon in data:
            if pokemon['id'] == pokemon_id:
                name_label.config(text=f"Name: {pokemon['name']['english']}")
                id_label.config(text=f"ID: {pokemon['id']}")
                type_label.config(text=f"Type: {pokemon['type']}")

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

name_label = tk.Label(root, text="Name")
name_label.grid(column=2, row=2)
id_label = tk.Label(root, text="ID")
id_label.grid(column=3,row=4)
type_label = tk.Label(root, text="Type")
type_label.grid(column=3,row=5)
title1_label = tk.Label(root, text="Pokémon Pokedex", font=("Arial", 14))
title1_label.grid(column=1, row=0, padx=20, pady=20)

entry = tk.Entry()
entry.grid(column=0, row=2, pady=5)

button = tk.Button(root, text="Who's that Pokémon?", command=lambda: button_command(1))
button.grid(column=1,row=2, pady=10)


root.mainloop()
