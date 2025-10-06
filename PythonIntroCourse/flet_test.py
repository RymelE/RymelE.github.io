import flet
from flet import IconButton, Page, Row, TextField, Text, icons

def main(page: Page):
    page.title = "Flet counter example"
    page.vertical_alignment = "top"
    page.horizontal_alignment = "left"

    # Corrected: Using Text instead of text (which is undefined)
    text = Text(value="Click the plus or minus on the counter", size=40, color='blue')

    # Create a TextField for displaying the counter value
    txt_number = TextField(value="0", text_align="center", width=50)

    # Function to handle the minus button click
    def minus_click(e):
        txt_number.value = str(int(txt_number.value) - 1)
        page.update()

    # Function to handle the plus button click
    def plus_click(e):
        txt_number.value = str(int(txt_number.value) + 1)
        page.update()

    # Add the text and Row with buttons to the page
    page.add(text)
    page.add(
        Row(
            [
                IconButton(icons.REMOVE, on_click=minus_click),
                txt_number,
                IconButton(icons.ADD, on_click=plus_click),
            ],
            alignment="center",
        )
    )

# Start the app and specify the main function as the target
flet.app(target=main)
