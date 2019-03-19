import Item

def main():
    description = "Jacket"    # Setting first item's description to jacket
    units = 12      # Setting number of units for first item
    price = 59.95   # Settinf price for first item
    item1 = Item.Item(description, units, price)  # Passing variables as arguments to item1 object with Item class from Item file
    print("Description:", item1.get_description()) # Calling get_description method for object's description
    print("Units:", item1.get_units())  # Calling accessor method for item1
    print("Price:", item1.get_price())  # Calling get_price method for object's price
    description = "Designer Jeans"
    units = 40
    price = 34.95
    item2 = Item.Item(description, units, price) # Passing variables as arguments to item2 object with Item class from Item file
    print("Description:", item2.get_description())  # Calling accessor method which returns item2's description
    print("Units:", item2.get_units())  # Calling get_units for item2
    print("Price:", item2.get_price())  # Calling get_price for item2
    description = "Shirt"
    units = 20
    price = 24.95
    item3 = Item.Item(description, units, price) # Passing variables as arguments to item3 object with Item class from Item file
    print("Description:", item3.get_description()) # Calling get_description for item3
    print("Units:", item3.get_units())  # Calling get_units for item3
    print("Price:", item3.get_price())  # Calling get_price for item3
main()   # Calling main
