# In python function can be defined by def keyword
'''
#Function to subtract two numbers
# Declaration of function
def subtractor():
    print("Program to subtract two number\n")
    num1=input('Enter first number\n')
    num2=input('Enter second number\n')

    sub=float(num1)-float(num2)
    print(sub)


subtractor()    #Call subractor function
'''

#Function with Return something

# Declaration of function
def subtractor(a,b):
   
    sub=float(num1)-float(num2)
    return sub

    

print("Program to subtract two number\n")
num1=input('Enter first number\n')
num2=input('Enter second number\n')
res = subtractor(num1,num2)    #Call subractor function
print(res)
