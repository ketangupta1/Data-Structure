''' print all the subsequence whose sum is k 
soln: Just take one more argument as sum with subsequence function, and in base, condition check if sum == k then print the subsequence. '''

class PrintSubsequence:
    def subsequence(self, ind, s, li, sum, n):
        if ind == len(n):
            if s == sum:
                print(li)
            return
        # Take or pick the particular element to the subsequence
        li.append(n[ind])
        s += n[ind]
        self.subsequence(ind+1, s, li, sum, n)
        # Not take or not pick, this element is not added to your subsequence
        s -= n[ind]
        li.remove(n[ind])
        self.subsequence(ind+1, s, li, sum, n)


if __name__ == "__main__":
    n = []
    while True:
        num = int(input("Enter no to add in list: "))
        if num == 0:
            break
        n.append(num)
    sum = int(input("Enter the sum you want: "))
    ob = PrintSubsequence()
    ob.subsequence(0, 0, [], sum, n)
