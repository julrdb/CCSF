#Julius Rey D. Barro
#CS110A HW3
#This turtle graphics draws a shape repeatedly that gets bigger as it spirals out in a clockwise fashion. The polygon, starting size, and number of repetition is determined by the user's input from my three questions. 

#Source Code

import turtle
juls = turtle.Turtle()

numRepeat = int(input("How many shapes you want drawn? "))
numSides = int(input("How many sides do you want your polygon to draw? "))
inAngle = int(input("What interior angle do you want to choose? "))
#inAngleF = (180-inAngle)
length = int(input("How small would you want it to start from? (Choose 1-50 only) "))
deg = float(input("How many degrees do you want the shape to draw on every repeat? (Choose 1-5 only) "))

for r in range(1, numRepeat):
  juls.right(deg)
  length += 1
  for p in range(numSides):
    juls.forward(length)
    juls.left(inAngle) #(360/num_sides)
    juls.speed(0)

'''
1st Output

1. How many sides do you want your polygon to draw? 3
2. How small would you want it to start from? (Choose 1-50 only) 15
3. How many shapes you want drawn? 360
4. How many degrees do you want the shape to draw on every repeat? (Choose 1-5 only) 1

2nd Output

1. How many sides do you want your polygon to draw? 6
2. How small would you want it to start from? (Choose 1-50 only) 30
3. How many shapes you want drawn? 210
4. How many degrees do you want the shape to draw on every repeat? (Choose 1-5 only) 2
'''
