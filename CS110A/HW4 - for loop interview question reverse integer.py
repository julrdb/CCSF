'''
*Julius Rey D. Barro
*HW4
*An Interview Coding Challenge Question.
*Disclaimer:

Building this was super tricky. With the help of Mounir I found what was missing to make this work.

'''
usernum = input("Give me any number and I'll reverse it:\n")
accu = 0
for i in range(len(usernum)):
  mod = int(usernum)%10
  accu = accu * 10 + mod
  usernum = int(usernum) // 10
print("Here it is:",accu,"\n")