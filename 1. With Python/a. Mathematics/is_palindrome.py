n = int(input("Enter number to check palindrome: "))
rev = 0
temp = n
while temp>0:
    rev = rev*10+(temp%10)
    temp//=10
if n == rev:
    print("Palindrome")
else:
    print("Non Palindrome")
