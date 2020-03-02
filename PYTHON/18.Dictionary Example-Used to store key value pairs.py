examDic = {

    "Name" : "DEEPAK",
    "Class": "B.E.",
    "Marks" : "9.3",
    "Hours in College": 7
}

print(examDic)
print(examDic["Marks"])  #Access only one Dictionary elements.ArithmeticError

#To delete some elements from the dictionary
examDic.pop("Marks") #Marks will removed.
print(examDic)

#We can use del , clear ,update,pop etc.