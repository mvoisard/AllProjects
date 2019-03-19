# Name:       Max Voisard
# Class:      Programming with Python CIT248S
# Date:       4/4/2017
# Assignment: Chapter 9 Programming Challenge

roomNumber = {'CS101':'3004', 'CS102':'4501', 'CS103':'6755', 'NT110':'1244', 'CM241':'1411'}  # Creating dictionary for course number's room numbers
instructor = {'CS101':'Haynes', 'CS102':'Alvarado', 'CS103':'Rich', 'NT110':'Burke', 'CM241':'Lee'}  # Creating dictionary for course number's instructors
meetingTime = {'CS101':'8 a.m.', 'CS102':'9 a.m.', 'CS103':'10 a.m.', 'NT110':'11 a.m.', 'CM241':'1 p.m.'}  # Creating dictionary for course number's meeting times
courseNumber = input("Enter a course number: ")  # Getting input from user on course number
print("The course's room number is", roomNumber[courseNumber])   # Getting user-specified course number's room number from dictionary
print("The course's instructor is", instructor[courseNumber])    # Getting user-specified course number's instructor from dictionary
print("The course's meeting time is", meetingTime[courseNumber]) # Getting user-specified course number's meeting time from dictionary
