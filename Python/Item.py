# Name:       Max Voisard
# Class:      Programming with Python CIT248S
# Date:       4/11/17
# Assignment: Chapter 10 Programming Exercise

class Item:

    def __init__(self, description, units, price):  # init method
        self.__description = description  # Instantiating objects
        self.__units = units
        self.__price = price

    def set_description(self, description):  # Setter method for description
        self.__description = description  # Assigning argument to variable

    def set_units(self, units): # Mutator method for units
        self.__units = units    # Assigning units argument to variable

    def set_price(self, price): # Setter method for price
        self.__price = price    # Setting value to price

    def get_description(self):     # Getter method for description
        return self.__description  # Returning description to main

    def get_units(self):     # Accessor method for units
        return self.__units  # Return statement for units

    def get_price(self):     # get_price method
        return self.__price  # Returning price to main
