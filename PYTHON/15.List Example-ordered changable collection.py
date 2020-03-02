lst = [10,20,30,40,50,60]

type_lst = type(lst)
print(type_lst)

print(lst)

#To Slice list , we used slicing string 
slic = lst[2:4]
print(slic)

#Replace elements of list(List will changed)
lst[2] = 25
slic = lst[2]
slic = lst #Mandatory to use this to changed in list.(Original list)
print(slic)

#Length of list
print(len(lst))

#TO ADD ELEMENT IN THE END OF LIST ,WE USED append(element) function.
lst.append(70)      #add 70 at the end of list.
slic = lst
print(slic)

#INSERT AN ELEMENT AT SPECIFIC POSITION OF LIST
lst.insert(1,15)  #It means, insert 15 at 1 position of list.
slic = lst
print(slic)
print('Now,Length of list is :{0} '.format(len(slic)))

#REMOVE ANY ELEMENT FROM LIST,WE USED remove() function
lst.remove(25)
slic = lst
print(slic)

#WE HAVE ANOTHER ONE function which is used to REMOVE element at the end of list.
lst.pop()
slic = lst
print(slic)

#Delete any element at any position
del lst[1]     #Here 1 is position of list.we can use [1:3] for multiple delete.
slic = lst
print(slic)

#Function to delete all elements of list
lst.clear()
slic=lst
print(slic)