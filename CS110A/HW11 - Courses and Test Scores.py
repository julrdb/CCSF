classcount = int(input("how many classes?"))
allgrades = [0]*classcount

for i in range(classcount):
  gradecount = int(input("how many grades for class", [i] ,"?"))
  gradelist = [0]*gradecount
  for j in range(gradecount):
    gradelist[j] = int(input("enter grade then hit 'enter'"))
  allgrades[i] = gradelist