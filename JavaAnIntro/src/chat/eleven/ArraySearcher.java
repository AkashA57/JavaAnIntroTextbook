package chat.eleven;

public class ArraySearcher
{
     private int[] a;


    public ArraySearcher(int[] theArray)
    {
    	a = theArray;
    }

    public int find(int target) {
        return binarySearch(target, 0, a.length - 1);
    }

    private int binarySearch(int target, int first, int last)
    {
    	int result;
    	if (first > last) {
    		result = -1;
    	}
    	else {
    		int mid1 = first+(last-first)/3;
    		
    		int mid2 = last -(last-first)/3;
   
    		if (target == a[mid1]) {
    		   result = mid1;
    		}
    		else if(target == a[mid2]) {
     		   result = mid2;
     		}
    		else if(target < a[mid1]) {
    			result = binarySearch(target, first, mid1-1);
    		}
    		else if(target > a[mid2]){
    		   result = binarySearch(target, mid2 + 1, last);
    		} 
    		else {
    			result = binarySearch(target, mid1 + 1, mid2 - 1);
    		}
    	}
    return result;
    }

}
