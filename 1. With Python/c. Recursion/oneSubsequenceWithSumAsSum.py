''' Print subsequence whose sum is k. (Printing only one subsequence)
soln: when base case is satisfied just return true and check every function whether it is giving result as true or not and if it is true 
then immediately return from the function because you got one subsequence. '''

class PrintSubsequence:
    def subsequence(self, ind, s, li, sum, n):
        if ind == len(n):
            if s == sum:
                print(li)
                return True
            return False
        # Take or pick the particular element to the subsequence
        li.append(n[ind])
        s += n[ind]
        if self.subsequence(ind+1, s, li, sum, n):
            return True
        # Not take or not pick, this element is not added to your subsequence
        s -= n[ind]
        li.remove(n[ind])
        if self.subsequence(ind+1, s, li, sum, n):
            return True
        return False


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
