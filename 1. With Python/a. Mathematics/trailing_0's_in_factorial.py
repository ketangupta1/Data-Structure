# Method: 1 Iterative approach
n = int(input("Enter number to count trailing 0's in factorial of that number: "))
fact = 1
for i in range(2,n+1):
    fact*=i
count = 0
while fact>0:
    rem = fact%10
    if rem == 0:
        count+=1
    else:
        break
    fact//=10
print(count)


# Method: 2 Efficient approach
''' A number is having trailing 0's when its prime factorisation contains 2 and 5. 
so when we will find number of 2's and 5's in a prime factor then it will be number of trailing 0's as well.
In a factorial of any number the number of 5's are always less than number of 2's so if we find the count of 5's we will get the number of trailing 0's as well. '''
# dip dive to solution
''' Lets assume we need to find trailing 0's in factorial of 150 : 1*2*3*4*5*6*-----*25*26*-----*125*126*-----150
so here we can find in each 5th number we have a 5 so number of 5 will be 150/5 (step:1), but we can see 25 is having two 5 in their prime factorisation so each 25th number will be having two five 
so one 5 is counted in step:1 and extra 5 will be counted by 150/25, and each 125th number will be having three 5 
so one 5 is counted in step:1 2nd counted in step:2 and the third will be counted by 150/125'''

n = int(input("Enter number to count trailing 0's in factorial of that number: "))
power = 1
count = 0
while n//(5**power)>0:
    count+=n//(5**power)
    power+=1
print(count)

# TC: O(logn)
