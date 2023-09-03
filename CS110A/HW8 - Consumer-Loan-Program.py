#calculate Interest/Loan
def Loan():
  print("The Consumer loan calculator\n")
  while(Loan):
    Borrow = int(input("How much do you want to borrow?"))
    if Borrow <= 0:
      print("Can't be negative friend. Try again.")
    else:
      Interest = True
      while(Interest):
        int(input("How much is the interest in percentage?"))
        if Interest <= 0:
          print("Invalid input. Must be higher than zero.")
        else:
          print("we done")          
Loan()

'''  
Interest = int(input("What is the interest rate expressed in percent?"))
if Payplan < Interest/100 * Loan: 
  print("Your monthly payment has to be ")
  Payplan = input("How much would you be willing to pay monthly?")

def AnnualInterest calc():

def Payplan calc():

def Monthlypay calc():
'''
#calculate how many months to pay, int val
#monthly compound interest formula