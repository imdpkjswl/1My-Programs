import math
import cv2 #It is used for image processing.

num1 = input('Enter first number\n')
num2 = input('Enter second number\n')

#Predefined math function for calculate gcd of two number.
#num1 and num2 has been type casted into string to integer.
print(math.gcd(int(num1),int(num2))) 
