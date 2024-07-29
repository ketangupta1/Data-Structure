n = int(input("Enter number to check palindrome: "))
print(n)
rev = 0
original_n = n
while n>0:
    rev = rev*10+(n%10)
    n//=10
if original_n == rev:
    print("Palindrome")
else:
    print("Non Palindrome")
