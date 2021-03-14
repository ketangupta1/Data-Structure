public class InPlaceHeapSort {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		int Hsize=1,i;
        int n=arr.length-1;
        
        for(i=0;i<arr.length;i++)
        { 
            int childIndex=i;
            int parentIndex=(childIndex-1)/2;
            while(childIndex>0)
            {
                if(arr[parentIndex]>arr[childIndex])
                {
                        int temp=arr[childIndex];
                        arr[childIndex]=arr[parentIndex];
                        arr[parentIndex]=temp;
                        childIndex=parentIndex;
                        parentIndex=(childIndex-1)/2;
                }
                else
                    break;
            }
        }
        Hsize=arr.length-1;
        for(i=0;i<arr.length;i++)
        {
            int temp=arr[0];
            arr[0]=arr[Hsize];
            arr[Hsize]=temp;
            Hsize--;
            int index=0,rightChildIndex=2,leftChildIndex=1;
            while(leftChildIndex<=Hsize)
            {
                int minIndex=index;
                if(arr[leftChildIndex]<arr[minIndex])
                {
                    minIndex=leftChildIndex;
                }
                if(rightChildIndex<=Hsize && arr[rightChildIndex]<arr[minIndex])
                {
                    minIndex=rightChildIndex;
                }
                if(minIndex!=index)
                {
                    int temp1=arr[index];
                    arr[index]=arr[minIndex];
                    arr[minIndex]=temp1;
                    index=minIndex;
                    leftChildIndex=(2*index)+1;
                    rightChildIndex=(2*index)+2;
                }
                else
                {
                    break;
                }
            }
            
        }
	}
}
