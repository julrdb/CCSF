'''
This exercise evaluates user input's words or phrases by reversing the string and checks whether it is a palindrome or not. This code allow words with special characters i.e. !,#,$, etc., and whitespaces, then it gets rid of them just leaving the word or phrase connected together, then converts all to lower case because we know palindrome checking is case sensitive. So Madam to madaM will return false because the capital M isn't on the same index (0 and 4). Finally after the user's input has been evaluated, they will be asked whether or not they want to try another one. 
'''
def main():
  x = input("\nPlease enter a word or phrase and we'll evaluate whether it is a palidrome or not: ")
  j = ''.join(i for i in x if i.isalnum()).lower()
  #line above evaluates palindrome phrases. It filters out special characters and white spaces then converts all to lower case.
  # .join method without regex link:
  #https://stackoverflow.com/questions/5843518/remove-all-special-characters-punctuation-and-spaces-from-string
  y = j[::-1]
  print(y)
  if j in y:
    print(x,"is a palindrome")
  else:
    print("This is not a palindrome")
  again = input("Wanna try another one?")
  while again:
    if again.lower() in "yesyeahyupsureokokay":
      return main()
    else:
      break
main()
