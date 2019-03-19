# Name:        Max Voisard
# Class:       Programming with Python CIT248S
# Date:        4/25/17
# Assignment:  Chapter 12 Programming Exercise

def main():
    originalNumber = int(input("Please enter a number: "))   # Asking user for number
    while originalNumber < 1:      # If statement testing if number is 0 or less
       print("Invalid. Numbers must be at least 1.")  # Saying number is invalid
       originalNumber = int(input("Please enter a number: "))   # Asking for number again
    print("The sum of the numbers 1 to", originalNumber, "is:", GetTotal(originalNumber))  # Calling ListOfNumbers and passing number argument

def GetTotal(originalNumber):   # GetTotal() method with number paramter received
    if originalNumber == 1:     # If statement testing if number is 1
        return originalNumber   # If it is 1, adding the sum of 1 and 0 is 1
    else:                                                      # Else to factor numbers greater than 1
        return(originalNumber + GetTotal(originalNumber - 1))  # Returning total of all integers 1 to number added up to main
main()     # Calling main
