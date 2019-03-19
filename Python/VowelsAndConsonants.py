# Name:       Max Voisard
# Class:      Programming with Python CIT230S
# Date:       3/28/17
# Assignment: Chapter 8 Programming Challenge

def main():
    string = input("Enter a sentence: ")   # Asking user for a string
    sentence = string.lower()  # Converting characters to lowercase for array
    vowelCounter = Vowels(sentence)  # Returned vowel counter equals method with string argument passed
    consonantCounter = Consonants(sentence) # Returned consonant counter equals method with string argument 
    print("The number of vowels is:", vowelCounter)  # Displaying the number of vowels
    print("The number of consonants is:", consonantCounter)  # Displaying the number of consonants
    
def Vowels(string):    # Vowels method with string parameter
    vowelCounter = 0   # Vowel counter, to increment
    vowel = ['a', 'e', 'i', 'o', 'u']  # Array for vowel letters
    for ch in string:   # For loop to go through characters
        for character in vowel:  # Nested for loop to go through array elements, ALSO CAN DO: for count in range(5):
           if ch == character:   # If statement testing if there is a match
              vowelCounter += 1  # Adding to vowel counter variable
    return vowelCounter  # Returning variable to main
    
def Consonants(sentence):  # Consonants method with string parameter
    consonantCounter = 0   # Consonant counter, to increment
    consonant = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'] # Consonants array
    for char in sentence:     # For loop to go through characters in inputted string
        for character in consonant:  # Nested for loop to go through consonant array
           if char == character:   # If statement to determine if a character matches
              consonantCounter += 1  # Incrementing consonant counter
    return consonantCounter   # Returning consonant counter to main
main()    # Calling main
