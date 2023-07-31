R = int(input("Enter the number of rows:"))
C = int(input("Enter the number of columns:"))
result = [[0,0],
         [0,0]]

# Initialize matrix
X = []
Y=  []

def matrix(R,C):
    o=[]
    for i in range(R):		 # A for loop for row entries
        a2 =[]
        for j in range(C):	 # A for loop for column entries
            a2.append(int(input(f"Enter elements row-wise{[i+1]} {[j+1]}: ")))
        o.append(a2)
    return o

X=matrix(R,C)
print("the first matrix is: ",X)
print("For the second matrix:")
Y=matrix(R,C)
print("the second matrix is: ",Y)

#Addition of two matrices:
# iterate through rows
def addi(X,Y):
    for i in range(len(X)):
       # iterate through columns
       for j in range(len(X[0])):
           result[i][j] = X[i][j] + Y[i][j]
    print("The addition result is:\n")
    for r in result:
        print(r)
addi(X,Y)

#Subtraction of two matrices:
# iterate through rows
def sub(X,Y):
    for i in range(len(X)):
       # iterate through columns
       for j in range(len(X[0])):
           result[i][j] = X[i][j] - Y[i][j]
    print("The subtraction result is:\n")
    for r in result:
        print(r)
sub(X,Y)
result1=[[0,0],[0,0]]
def mult(X,Y):
    for i in range(len(result1)):
        for j in range(len(result1[0])):
            for k in range(len(Y)):
                result1[i][j]+=X[i][k]*Y[k][j]
    print("Multiplication result is:")
    for r in result1:
        print(r)
mult(X,Y)
#Transpose
# iterate through rows
def transpose(X,Y):
    for i in range(len(X)):
       # iterate through columns
       for j in range(len(X[0])):
           result[j][i] = X[i][j]
    print("Transpose is:\n")
    for r in result:
       print(r)
transpose(X,Y)