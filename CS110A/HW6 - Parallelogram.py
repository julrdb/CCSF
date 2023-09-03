def rptChar(numRpt, outputChar):
  for colNo in range(numRpt):
     print(outputChar, " ")

def main():
  length = int(input("How long you want the parallelogram to be?\n" ))
  char = input("Please indicate which character do you want to draw the parallelogram \n")
  for x in range(length+1):
    rptChar(x, char)
    print()

  for x in range(length-1,0,-1):
    rptChar(length-x, " ")
    rptChar(x, char)
    print()  

main()  