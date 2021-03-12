import java.util.*;
public class MaxHeapImplementation {
	// Complete this class
    ArrayList<Integer> heap;
    public PQ() {
        heap=new ArrayList<>();
    }
    
	boolean isEmpty() {
		return heap.size()==0;
        // Implement the isEmpty() function here
	}

	int getSize() {
		return heap.size();// Implement the getSize() function here
	}

	int getMax() {
        if(isEmpty())
            return Integer.MIN_VALUE;
		return heap.get(0);// Implement the getMax() function here
	}

	void insert(int element) {
        heap.add(element);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex>0)
        {
            if(heap.get(parentIndex)<heap.get(childIndex))
            {
                int temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else
                return;
        }
	}

	int removeMax() {
        if(isEmpty())
            return Integer.MIN_VALUE;
        int num=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentIndex=0,childIndex1=(2*parentIndex)+1,childIndex2=(2*parentIndex)+2;
        while(childIndex1<heap.size()-1 ||childIndex2<heap.size()-1)
        {
            if(heap.get(parentIndex)<heap.get(childIndex1) || heap.get(parentIndex)<heap.get(childIndex2))
            {
                if(heap.get(childIndex1)<heap.get(childIndex2))
                {
                    int temp=heap.get(parentIndex);
                    heap.set(parentIndex,heap.get(childIndex2));
                    heap.set(childIndex2,temp);
                    parentIndex=childIndex2;
                }
                if(heap.get(childIndex1)>heap.get(childIndex2))
                {
                    int temp=heap.get(parentIndex);
                    heap.set(parentIndex,heap.get(childIndex1));
                    heap.set(childIndex1,temp);
                    parentIndex=childIndex1;
                }
                childIndex1=(2*parentIndex)+1;
                childIndex2=(2*parentIndex)+2;
            }
            else 
                return num;
        }
        return num;
        
	}
}
