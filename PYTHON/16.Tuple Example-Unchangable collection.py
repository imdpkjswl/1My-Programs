#Tuple - We can not change elements of list in Tuple

name = ("FULLNAME" ,"DEEPAK","JAISWAL")

tup = name
typeTup = type(tup)
print(typeTup)
print(tup)  #Tuple is created.

#VERIFY WE CAN'T CHANGE VALUE OF TUPLE
'''
name[0] = "MY NAME IS "
tup = name
print(tup)  # Assign not support.
'''

#We can change tuple by changing tuple to list
name = list(name)
name[0] = "MY NAME IS "
tup = name
print(tup)


''' We can also use :  pop, .clear, del , and.. intersection, union'''