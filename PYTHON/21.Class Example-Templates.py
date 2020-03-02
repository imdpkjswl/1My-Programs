#Class with Constructor
class Employee:  # class name
    def __init__(self,myName,mySalary):  #Declaration of constructor with self keyword as arguments
        self.name = myName   #It shows,what happened when the object made of class
        self.salary = mySalary


variable = Employee("Deepak",2019) # object as constructor
print(variable.name) #Here, variable is an object to accesss class
print(variable.salary)