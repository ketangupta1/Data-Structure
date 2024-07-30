'''If we want to find the largest square form by a rectangle of given sides a and b then their solution will be the gcd of a and b '''

# Naive Solution
a = int(input("Enter 1st number to find GCD: "))
b = int(input("Enter 2nd number to find GCD: "))
res = min(a,b)

while res>0:
    if a%res == 0 and b%res == 0:
        break
    res-=1
print(res)
