import tkinter as tk
import json 

root = tk.Tk()
root.geometry("800x800")

#url = 
#button command to call the id number from the json file
def button_command(pokemon_id):
    pokemon_id = int(entry.get())
    try:
        with open('pokemon.json', 'r', encoding='utf-8') as file:
            data = json.load(file)  # data is a list of dicts

        for pokemon in data:
            if pokemon['id'] == pokemon_id:
                name_label.config(text=f"Name: {pokemon['name']['english']}")
                
                type_label.config(text=f"Type: {pokemon['type']}")
                hp.config(text=f"HP: {pokemon['base']['HP']}")
                Att.config(text=f"HP: {pokemon['base']['Attack']}")
                Def.config(text=f"HP: {pokemon['base']['Defense']}")
                Spa_Att.config(text=f"HP: {pokemon['base']['Sp. Attack']}")
                Spa_Def.config(text=f"HP: {pokemon['base']['Sp. Defense']}")
                Speed.config(text=f"HP: {pokemon['base']['Speed']}")
                break
        else:
            print(f"Error: no Pokémon with that Pokédex number {pokemon_id}")

    except FileNotFoundError:
        print("Error: 'pokemon.json' file not found.")
    except json.JSONDecodeError:
        print("Error: JSON file is not valid.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
#title
root.title("Pokemon")

#labels pokedex
title1_label = tk.Label(root, text="Pokémon Pokedex", font=("Arial", 14))
title1_label.grid(column=2, row=0, padx=20, pady=20)

#picture
#pic

name_label = tk.Label(root, text="Name",font=("Arial", 14))
name_label.grid(column=3, row=3)


type_label = tk.Label(root, text="Type",font=("Arial", 14))
type_label.grid(column=3,row=4)

#stats label
frame = tk.Frame(root)
frame.grid(row=5,column=0)
hp = tk.Label(frame, text="HP",font=("Arial", 14))
hp.grid(column=1,row=0)
Att = tk.Label(frame, text="Att",font=("Arial", 14))
Att.grid(column=2, row=0)
Def = tk.Label(frame, text="Def",font=("Arial", 14))
Def.grid(column=3, row=0)
Spa_Att = tk.Label(frame, text="Spa Att",font=("Arial", 14))
Spa_Att.grid(column=4, row=0)
Spa_Def = tk.Label(frame, text="Spa Deff",font=("Arial", 14))
Spa_Def.grid(column=5, row=0)
Speed = tk.Label(frame, text="Speed",font=("Arial", 14))
Speed.grid(column=6,row=0)


entry = tk.Entry()
entry.grid(column=3, row=2, pady=5)

button = tk.Button(root, text="Who's that Pokémon?", command=lambda: button_command(1))
button.grid(column=1,row=2, pady=10)

root.mainloop()
