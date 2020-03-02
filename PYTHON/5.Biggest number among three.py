''' THIS IS A MULTI-LINE COMMENT
    Program to find biggest number among three number
    '''
import os

# i=single line comment: Taking three numbers from the users.
num1 = input('Enter first number\n')
num2 = input('Enter second number\n')
num3 = input('Enter third number\n')

#Using if-elif condition checking statement
if(num1>=num2 and num1>num3):
    biggest = num1
elif(num2>=num1 and num2>num3):
    biggest = num2
else:
    biggest = num3

# printing the result
print('The biggest number among {0},{1} and {2} is  {3}\n'.format(num1,num2,num3,biggest))

# Library and code to pause screen
os.system("pause")