# Set is used for printing or operating without repeatiting same elements.

S1 = {12,22,3,3,3,1,1,5,5,5,6,8,1,12}
print(S1)

#add elements in Set 
S1.add(77)
print(S1)


#Update a set: It is used to add multiple elements
S1.update([12,45,76,23,98,55,87])
print(S1)
print(len(S1))  #This will show only nom=n-repeated elements.

#Remove element from set BUT In case of elements are not avail in set then this will gives an error.
S1.remove(23)
print(S1)

#Remove element from set Without getting an error if element avail or not in set.
S1.discard(1223) #1223 is not avail in set but it'll not show any error.
S1.discard(22)  #22 will dicarded from set if it'll avail.
print(S1)
