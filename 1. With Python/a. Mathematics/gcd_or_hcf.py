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


# Efficient Solution
''' Euclidean algorithm: gcd(a,b) = gcd(a-b,b) where a>b; or gcd(a,b) = gcd(a%b,b) or gcd(a,b%a) and if one of the a or b will become 0 the other number will be gcd '''

a = int(input("Enter 1st number to find GCD: "))
b = int(input("Enter 2nd number to find GCD: "))
while a > 0 and b > 0:
    if a > b:
        a = a % b
    else:
        b = b % a
if a == 0:
    print(b)
else:
    print(a)
