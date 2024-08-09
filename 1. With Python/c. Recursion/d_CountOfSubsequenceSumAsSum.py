''' Get the count of subsequence whose sum is k
soln: For getting count of subsequence just return l+r, where l is the count of subsequence found at the left of tree and r is the count of subsequence found at the right of tree. 
In the base case just return 0 if subsequence sum is not equal to k and return 1 when its equal to k. Just draw recursion tree you will get the idea how its working. '''

class PrintSubsequence:
    def subsequence(self, ind, s, sum, n):
        if ind == len(n):
            if s == sum:
                return 1
            return 0
        s += n[ind]
        l = self.subsequence(ind+1, s, sum, n)

        s -= n[ind]
        r = self.subsequence(ind+1, s, sum, n)

        return l+r
        


if __name__ == "__main__":
    n = []
    while True:
        num = int(input("Enter no to add in list: "))
        if num == 0:
            break
        n.append(num)
    sum = int(input("Enter the sum you want: "))
    ob = PrintSubsequence()
    print(ob.subsequence(0, 0, sum, n))
