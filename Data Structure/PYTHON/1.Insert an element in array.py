# Python program for inserting 
# an element in an unsorted array 
  
# method to insert element at the last of array
def insert(arr, element): 
    arr.append(element) 
  
# declaring array and key to insert  
arr = [1, 2, 3, 4, 5, 6,7,8,9] 
item = 10
   
# array before inserting an element 
print ("Before Inserting: ") 
print (arr) 
   
# array after Inserting element  
insert(arr, item) 
print("After Inserting: ") 
print (arr) 