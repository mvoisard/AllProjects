# Name:       Max Voisard
# Class:      Programming with Python CIT248S
# Date:       3/21/17
# Assignment: Chapter 7 Programming Challenge

NUM_MONTHS = 6  # Setting global constant for number of months

def main():
  rainfall = [0] * NUM_MONTHS   # Setting list to size of number of months
  count = 0   # Declaring and initializing loop counter variable
  while count < NUM_MONTHS:    # While loop for number of months
      print("Rainfall for month #", count + 1, ": ", sep='', end='') # Asking for rainfall amount
      rainfall[count] = float(input())  # Asking for number in float precision
      count += 1  # Incrementing loop counter
  total = get_total(rainfall)  # Total returned from get_total method call with rainfall as argument
  average = get_average(total)   # Average returned from get_average call with total as argument so it can calculate average
  highest, lowest = get_extremes(rainfall)   # Minimum and maximum returned from get_extremes call with rainfall as argument
  display(total, average, highest, lowest)  # Calling the display function with four arguments

def get_total(rain):   # get_total function with rain as parameter
  total = 0   # Accumulator variable set to zero
  for val in rain:   # For loop to go through rain list
      total += val   # Adding values to total
  return total   # Returning total to main

def get_average(total):  # get_averafe function with total as parameter
  average = 0   # Declaring and initializing average to zero
  average = total / NUM_MONTHS   # Calculating average
  return average

def get_extremes(rain):   # get_extremes function with rain as parameter
  maximum = max(rain)  # Using max function to get highest number
  minimum = min(rain)  # Using min function to get lowest number
  return maximum, minimum

def display(total, average, highest, lowest):
  print("The total rainfall for six months was:", total)  # Displaying the total
  print("The average rainfall for each month was:", average)  # Displaying average
  print("The highest rainfall for a month was:", highest) # Displaying highest rainfall for month
  print("The lowest rainfall for a month was:", lowest) # Displaying lowest rainfall for month
main()   # Calling main
