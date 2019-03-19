# Name:       Max Voisard
# Class:      Programming with Python CIT248S
# Date:       5/2/17
# Assignment: Chapter 13 Programming Challenge

import tkinter                              # Importing tkinter for GUI screen

class MyGUI:                                # MyGUI class
    def __init__(self):                     # init method, self as parameter
       self.main_window = tkinter.Tk()      # Creating the main window
       self.top_frame = tkinter.Frame()     # Creating top frame
       self.mid_frame = tkinter.Frame()     # Creating mid frame
       self.bottom_frame = tkinter.Frame()  # Creating bottom frame
       self.name = tkinter.StringVar()      # Creating string variable for name
       self.address = tkinter.StringVar()   # Creating string variable for address
       self.city = tkinter.StringVar()      # Creating string variable for city
       self.nameLabel = tkinter.Label(self.top_frame, textvariable = self.name)  # Label for name at top frame to be equal to string variable
       self.addressLabel = tkinter.Label(self.mid_frame, textvariable = self.address)  # Label for address at mid frame to be equal to string variable
       self.cityLabel = tkinter.Label(self.bottom_frame, textvariable = self.city)  # Label for city at bottom frame to be equal to string variable
       self.button = tkinter.Button(self.bottom_frame, text = 'Show Info', command = self.do_something) # Send Info button which executes do_something when clicked
       self.quitButton = tkinter.Button(self.bottom_frame, text = 'Quit', command = self.main_window.destroy) # Quit button which terminates program through destroy method when clicked
       self.nameLabel.pack()                # Putting name label on screen
       self.addressLabel.pack()             # Putting address label on screen
       self.cityLabel.pack()                # Putting city label on screen
       self.button.pack(side = 'left')      # Putting Send Info button on screen
       self.quitButton.pack(side = 'left')  # Putting Quit button on screen, next to Send Info
       self.top_frame.pack()                # Packing top frame on screen
       self.mid_frame.pack()                # Packing mid frame on screen
       self.bottom_frame.pack()             # Putting bottom frame on screen
       tkinter.mainloop()                   # Main loop

    def do_something(self):                 # do_something method when Send Info button is clicked
       theName = "Max Voisard"              # Putting name in name variable
       theAddress = "11383 Marshall Road"   # Putting address in address variable
       theCity = "Versailles, OH 45380"     # Putting city in city variable
       self.name.set(theName)               # Putting name in name label
       self.address.set(theAddress)         # Putting address in address label
       self.city.set(theCity)               # Putting city in city label
       
my_gui = MyGUI()   # Creating an instance of the MyGUI class
