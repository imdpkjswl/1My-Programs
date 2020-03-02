# This is a single line comments
'''This is multi line comments
'''

'''
name = My name 
    is Deepak 
            Jaiswal
print(name)
'''
'''
print('I am a character')
print("I'm a string")
a =12
print(type(a))
a =12.0
print(type(a))
name = "Deepak"
print(type(name))
a =True
print(type(a))
'''
'''
#basic calc
a =5
b =2
print(a+b)
print(a-b)
print(a*b)
print(a/b);
print(a//b);
print(a**b);

print("a<b:",a<b)
print("a>b:",a>b)
print("a==b:",a==b)
print("a<=b:",a<=b)
print("a>=b:",a>=b)
print("a!=b:",a!=b)

print(a and b)
print(b and a)
print(b or a)
print(b or a)
print(not a)
print(not b)

a =12
a+=8
print(a)
'''


'''
a =51

if(a == 50):
    print("a is equal to  50")
elif(a<50):
    print("a is less than 50")
else:
    print("a is greater than 50")

'''

'''
num = int(input("Enter a number"))
if(num%2==0 and num%3 ==0):
    print("multiple of 6")
else:
    print("Not multiple of 6")
'''

'''
a =12
b=13
print("The sum of ",a,"and ",b,"is ",a**b)

print(list(range(1,11)))
for i  in list(range(1,11)):
    print(i)
    
print(list(range(100,200,10)))
'''
'''
lst = [1,2,3]
print(4 in lst) #Check element 
print(1 in lst)

i=0
while(i<=10):
     print(i)
     i+=1
'''

'''
for i in range(1,21,2):
    print(i,end ="  ")

for i in range(11):
    i+= .5
    print(i,end ="  ")
'''
'''
def Deepak():
    print("Deepak Jaiswal")
    
for i in range(0,10):
    Deepak();
'''

'''
def product(a=5,b=12):
    return a*b

res = product()
print("product : ",res)
res = product(2,4)
print("product : ",res)
res = product(b=2,a=5)
print("product : ",res)
'''

'''
#Positive indeces
name = "Deepak!"
print(name[0])
print(name[1])
print(name[2])
print(name[3])
print(name[4])
print(name[5])
print(name[6])
'''
'''
#Negative indeces
name = "Deepak!"
print(name[-1])
print(name[-2])
print(name[-3])
print(name[-4])
print(name[-5])
print(name[-6])
print(name[-7])
'''

'''
name1 = "Deepak "
name2 = "Jaiswal"
print(name1+"    " +name2)
i=0
#Display odd index characters
for d in name1:
    i=i+1
    if(i%2==0):
        continue
    else:
        print(d)
'''

'''
#String operation
str1 = "DEEPAK"
print(len(str1))
print(str1[::-1] #reversed string

#Sort a list
lst = [1,7,3,6,0,4]
lst.sort()
'''


'''
#Check for palindrome of a string
s = input("Enter a string\n")

if s==s[::-1]:
    print(" is a palindrome")
else:
    print(" isn't a palindrome")
'''


'''
#Checking if a stirng is made only numbers
num  = "12344"
d=num.isnumeric()
print(d)

st = "Deepak"
print(st.lower())
print(st.upper())
print(st.replace("Deepak","DEEPAK JAISWAL"))
'''

'''
s1 ="Good Afternoon"
print(s1.split())
print(s1.split('-'))

j1 = "abc"
j2 = "123"
print(j1.join(j2))
'''


#List : contain similar and dis-similar type element

'''
lst = [1,"Hello",True,3.43]
for i in lst:
    print(i)
    print(type(i))
'''

#Declaration of empty List
'''
lst = []

lst.append(12)
lst.append("Hello")
lst.append(12.234)
print(lst)
print(type(lst))
'''


'''
#Extend a List
lst = [1,2,3]
lst.pop() #popped item at last position
print(lst)
lst.extend([4,5]) #Extend a list from the last item
print(lst)
lst.insert(1,23) #Insert any item at any position
print(lst)
del lst[1] #Delete an item at any index point
print(lst)
lst.remove(2) #Remove any item if it will exist 
print(lst)
lst.reverse() # Used to reverse whole list
print(lst)
#Function to reverse the sorted list
lst1 = [1,2,3,4,5]
lst1.sort(reverse = True)
print(lst1) 
'''

'''
#List comprehension :Important

lst = [i for i in range(11)]
print(lst)

#Storing squares of numbers
lst = [i*i for i in range(11)]
print(lst)


#Display only even number
lst = [i for i in range(11) if i%2==0]
print(lst)

#Display only odd number
lst = [i for i in range(11) if i%2!=0]
print(lst)
'''

'''
#Print only one element of list
lst = [1]
print(lst)
print(type(lst)) # Some Compiler shows integer type data,why?????
'''



'''
#reverse a list without using build in Function
lst2 = [1,2,3,4,5,6,7]
lst2 = lst2[::-1]
print(lst2)
'''

'''
#Finding the index of an element in a list
lst3 = [5,10,15,20]
n=lst3.index(15)
print(n)

#Count the occurrences of an element
lst4 = [5,10,15,20,25,30]
print(lst3.count(15)) # If element exist in a list,then it'll return 1
print(lst3.count(12)) # Otherwise return 0
'''


'''
#Tuple : manupulation not allowed
t = (1,2,7,4,5)
print(t)

#Modification possible only converting into list
lst =list(t)
lst[2] =3
print(lst) #Printing after modifying
lst.append([6,7,8,9]) #This pushed list as it is in list
print(lst)
lst.extend([6,7,8,9]) #To remove extra square bracket from above list
print(lst)
'''



#SET : Collection of well define element without repeatition of item
'''
s = {1,2,3,4,5,3,2,1,6}
print(s)

#Declaration of an empty SET
s =set()
print(len(s))
#add item into set
s.add(1)
s.add(2)
s.add(3)
print(s)
#Remove element
s.remove(2)
print(s)
'''

#Basic operations on set
#1.Union
#2.Intersection
#3.Difference
'''
s1 = {1,2,3,4,5}
s2 = {4,5,6,7,8}

su=s1.union(s2)
si=s1.intersection(s2)
sd=s1.difference(s2)
sd2=s2.difference(s1)

print(su)
print(si)
print(sd)
print(sd2)
'''

'''
#CHECK IF AN ELEMENT PRESENT IN A SET
SET ={1,2,3,4,5}
ele =2

if ele in SET:
    print("Element present")
else:
    print("Element is not present")
'''

'''
#DICTIONARY :

d ={1:'a',2:'b',3:'c'}
print(d)

#Declaration of empty DICTIONARY
d = {}
d[0] = "HELLO"
d[1] = "WORLD"
d["Name"] = "DEEPAK"
d["Admission number"] = 263
print(d)


#Traverse the dictionary
for key in d:
    print(key," ->",d[key])
    

#Check if a key exist in dictionary or not
key = "Name"
if key in d:
    print(d[key])
'''

'''
#Tuple Ques:
t1 =(1) # it says integer type data
print(type(t1))
t2 =(1,) # it says tuple type data
print(type(t2))
'''




# OBJECT ORIENTED PROGRAMMING IN PYTHON

import numpy as np

'''
array = np.array([1,2,3,4,5])
print(array)

#2D arrays
array2d = np.array([1,2,3],[4,5,6])
print(array2d)
'''

#Operations on matrix +,-,*,/



































    



















