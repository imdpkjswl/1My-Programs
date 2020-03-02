#import cv2
import math
#Demo
'''print('Enter name')
print("DEEPAK")
print(4+3)
print(math.gcd(3,9))

'''
#Basic calc
'''
a = input("Enter a number\n")
b = input("Enter another number\n")
a = int(a)
b = int(b)
c = a+b
c = int(c)
print("sum : ",c)
c = a-b
c = int(c)
print("Minus ",c)
c = a*b
c = int(c)
print("Mul : ",c)
c = a/b
c = int(c)
print("Div : ",c)
typeC = type(c)
print("Type of c is ",typeC)
'''
# Printing Para as same as typed:
#
#para = ''' Hello
 #My Name Is
  #      Deepak Jaiswal'''
#print(para)
#print(para[0:5]) 

'''      
#String
name = "My name is , Deepak"
print(len(name))
print(name.lower())
print(name.upper())
print(name.replace(", Deepak","DJ"))
surname = " Jaiswal"
print("Concate :" ,name + surname)

str1 = "My name "
str2 = "Deepak"
print("Template : Hello {}is {} Jaiswal" .format(str1,str2))
print("Template : Hello {0}is {1} Jaiswal" .format(str1,str2))
print("Template : Hello {1} is {0} Jaiswal" .format(str1,str2))

#f String
name1 = "Hello"
name2 = "Deepak"
temp = f"{name1} , this is {name2}"
print(temp)
'''

'''
Python Collections:
1.List
2.Tuple
3.Sets
4.Dictionary
'''
#1.Lists : contain different items and perform manupulation
'''

lst = [1,2,3,4,5]
print(lst)
print(type(lst))

for i in lst:
    print("Print Full List",i)
print("\n")
for i in lst[0:3]:
    print("This is few List",i)

#Add element in list:
lst.append(10)
temp = lst
print("Added item ",lst)

#Insert item at specific position .insert(index,item)
lst.insert(1,12)
temp = lst
print("12 is inserted ",lst)

#Remove any item
lst.remove(3)
temp = lst
print("3 is removed ",temp)

#Pop an item at the end of list
lst.pop()
temp = lst
print("Last item is removed ",temp)

#Delete an item at specific position
del lst[3]
temp = lst
print("position 3rd item is deleted ",temp)

#Clear list
lst.clear()
temp = lst
print("List is cleared ",temp)
'''


#2.Tuple :Contain different items and manupulation not allowed
'''
t = ("Hello","Deepak","Jaiswal")
temp = t
print(type(temp))
print(temp)
#Below assignment not allowed
#t[0] = "Hi"
#print(temp)
#To overCome this problem,first convert it into list and make changes
t = list(t)
t[0] = "Hi"
temp =t
print(temp)
'''


#3.Sets : a collection of well defined object without repeatition
'''
s = {11,12,13,11,14,15,11,16,11,17,11,18}
print(type(s))
print(s)
#Add an element at last but don't repeat item
s.add(123)
print(s)
#update a set:i.e. Union of previous and current set
s.update([12,3,12,134,12,45,156,15,12,76])
print(s)
#Length of sets
print("Length of set is ",len(s))
#Remove any item element that'll already exist in a set
s.remove(12)
print(s)
#Remove any item element if it may exist in set
s.discard(156)
print(s)
s.discard(444)
print(s)

'''


#4.Dictionary :
'''
stuDict = {
    "Name" : "Harry",
    "Course" : "B.E.",
    "Percentage" : 77.23,
    "Hours in College" : 9
}
print(stuDict)
#Printing particular information
print(stuDict["Course"])
#Make changes on dictionary
stuDict["Course"] = "Bachelor of Engineering"
print(stuDict["Course"])
print(stuDict)
#Pop any particular item from dictionary
stuDict.pop("Course")
print(stuDict)
#We can make changes as : del,len,clear,pop,update
'''



#CONDITIONAL STATEMENTS

# IF
'''
age = input("Enter your age\n")
age = int(age)
print(type(age))

while True:
    if(age >=18 and age <=100):
        print("Your are eligible\n")
        exit()
    elif(age<=0):
        print("Enter the valid age\n")
        break;
    elif(age>100):
        print("Enter valid age! Age cnnot exceed above 100\n")
        break;
    else:
        print("Your are not eligible\n")
        break;
'''

#LOOPs
'''
# print number 1 to 500

for i in range(0,500):
    print(i+1)
'''

'''
i =0
while(i<500):
    print(i+1)
    i = i+1
    if i== 400:
        print("Continue starts")
        continue
    elif i == 450:
        break
'''




#FUNCTIONS : Block of code
'''
def welcome():
    print("WELCOME DEEPAK")

# Call Function one or more time
welcome()
welcome()
'''

#Function to add two number
'''
def sum(a,b):
    c = a+b
    return c

res = sum(23,27)
print(res)
'''

'''
#Recursion to print 1 to 100 

def recursion(n):
    if n == 0:
        return
    else:
        print(n)
        return recursion(n-1)
        

recursion(100)
'''


'''

#Create list and assign into it
lst =[]

n=int(input("Enter the number of element\n"))#Taking no. 0f element

#Applying loop from 0 to n.
for i in range(0,n):
    ele =int(input())
    lst.append(ele) #Add element into list
lst.sort()
print("The sorted elements are in ascending order :\n",lst)
lst.reverse()
print("The sorted elements are descending order :\n",lst)
    
'''



#Program to find root of quadratic eqn

import math

a = int(input("Enter the value of a\n"))
b = int(input("Enter the value of b\n"))
c = int(input("Enter the value of c\n"))

d=b*b-4*a*c
print("Discrement is {0}".format(d))

if(d==0):
    x=y=(-b/2*a)
    print("Both roots are same\n")
    print("First root is {0} and second root is {1}\n".format(x,y))
elif(d>0):
    x= (-b+math.sqrt(d))/(2*a)
    y= (-b-math.sqrt(d))/(2*a)
    print("Both roots are real and distinct\n")
    print("First root is {0} and second root is {1}\n".format(x,y))
else:
    x= -b/(2*a)
    y= math.sqrt(-d)/(2*a)
    print("Both roots are complex\n")
    #Round off method: {value : .dec_pointf}
    print("First root is {0}+{1:.2f}i and second root is {2}-{3:.2f}i\n".format(x,y,x,y))

















    
        


    

















    















