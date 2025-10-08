import tkinter as tk
import json 


root = tk.Tk()

def button_command(pokemon_id):
    print("Whos that Pokemon")
    try:
        with open('pokemon.json', 'r', encoding='utf-8') as file:
            data = json.load(file)
        for pokemon in data:
            if pokemon['id'] == pokemon_id:
                print("id", data['id'])
                print("name", data['name']['english'],)
                print("type", data[type])
            else:
                print("error no pokemon with that pokedex number{pokemon_id}")

    
    except FileNotFoundError:
        print("Error: 'pokemon.json' file not found.")
    except json.JSONDecodeError:
        print("Error: JSON file is not valid.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")

root.title("Pokemon")

label = tk.Label(root, text="Pokémon Pokedex", font=("Arial", 14))
label.pack(padx=20, pady=20)

# Example: When clicked, it searches for Pokémon ID 2
button = tk.Button(root, text="Who's that Pokémon?", command=lambda: button_command(2))
button.pack(pady=10)

root.mainloop()