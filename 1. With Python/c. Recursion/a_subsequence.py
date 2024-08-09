''' Print all subsequences: a contiguous or non-contiguous sequence that follows order. 
[3,1,2] :
{}
{3}
{1}
{2}
{3,1}: contiguous
{1,2}: contiguous
{3,2}: non-contiguous
{3,1,2}
these are the subsequences of the list [3,1,2].
{2,1}, {2,3}, {1,2,3} etc.. are not in order that's why it's not subsequences. However, it is subarray. A subarray may be a subsequence. '''


class PrintSubsequence:
    def subsequence(self, ind, li, n):
        if ind == len(n):
            print(li)
            return
        # Take or pick the particular element to the subsequence
        li.append(n[ind])
        self.subsequence(ind+1, li, n)
        # Not take or not pick, this element is not added to your subsequence
        li.remove(n[ind])
        self.subsequence(ind+1, li, n)


if __name__ == "__main__":
    n = []
    while True:
        num = int(input("Enter no to add in list and enter 0 to exit: "))
        if num == 0:
            break
        n.append(num)
    ob = PrintSubsequence()
    ob.subsequence(0, [], n)
