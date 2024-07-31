# We know that (a*b) = hcf(a,b) * lcm(a,b)

a = int(input("Enter 1st number to find GCD: "))
b = int(input("Enter 2nd number to find GCD: "))

temp_a = a
temp_b = b
while temp_a > 0 and temp_b > 0:
    if temp_a > temp_b:
        temp_a = temp_a % temp_b
    else:
        temp_b = temp_b % temp_a
if temp_a == 0:
    gcd = temp_b
else:
    gcd = temp_a

lcm = (a*b)//gcd
print(lcm)

# TC: O(log(min(a,b)))
