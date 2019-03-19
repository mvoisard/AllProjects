# Name:       Max Voisard
# Class:      Programming with Python CIT230S
# Date:       3/21/17
# Assignment: Chapter 7 Programming Challenge 2

def main():
   infile = open('charge_accounts.txt', 'r') # Opening the text file for reading
   accountNumbers = infile.readlines()  # Reading the contents of the file and putting into list
   infile.close()    # Closing the file
   count = 0    # Declaring and initializing loop counter to zero
   while count < len(accountNumbers):  # While loop for the length of the list
      accountNumbers[count] = int(accountNumbers[count])  # Converting file's string contents into integers
      count += 1   # Incrementing loop counter
   validation(accountNumbers)  # Calling function for validating numbers, passing list as argument

def validation(accountNumbers):   # Validation function with list parameter  
   account = int(input("Please enter a charge account number: ")) # Asking user for account number
   try:    # Try/except statement
       account_index = accountNumbers.index(account) # Seeing if number matches a number in the list
       isValid()  # Calling the isValid function
   except ValueError:   # Value error occurs if number doesn't match
       isNotValid()   # Calling the isNotValid function

def isValid():
    print("Valid! You entered in an account number from our list.")  # Printing statement of validity

def isNotValid():
    print("Invalid. That number was not found in our list.") # Printing statement that it's invalid
main()    # Calling main
