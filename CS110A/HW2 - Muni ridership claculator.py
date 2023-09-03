# Julius Rey Barro
# CS110A Homework 2 Muni Ridership Calc
# This interactive program will calculate the average usage of a specific Muni station each day.

print("Welcome to the Muni Ridership Calculator.")
Muni_Line = input("Which Muni line did you survey? ")
DaysCount = int(input("How many days did you survey it? "))
RiderCount = int(input("How many riders did you count? "))
print("According to your survey, about" ,RiderCount//DaysCount, "people ride the" ,Muni_Line, "station per day.")

