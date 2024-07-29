# Iterative Solution
# T(n), SC: O(1)
n = int(input("Enter number to find factorial: "))
result = 1
for i in range(2,n+1):
    result*=i
print(result)



# Recursive Solution
# T(n), SC: O(n)
n = int(input("Enter number to find factorial: "))
def fac(num):
    if num==1:
        return 1
    return num*fac(num-1)
result = fac(num = n)
print(result)
