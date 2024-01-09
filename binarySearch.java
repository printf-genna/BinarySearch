import java.util.Arrays;
import java.util.Collections;

public class Problem2 {

    public static <E extends Comparable <E>> 
    
    int binarySearch(E[]a, E value, int start, int stop){
        
        if(start <= stop && start >= 0 && stop < a.length){
        int mid = (start+stop)/2;
        int compareResult = a[mid].compareTo(value);
        if(compareResult==0){
                return mid;
        } else if (compareResult>0){

                return binarySearch(a,value,start,mid-1); // this is to look in the left half for example
                // if the mid value found in a list (1,2,3,4,5) is three and its too big then we can
                // proceed to just look at the left portion and vice versa
        } else {

                return binarySearch(a,value,mid+1, stop); // this is to look in the right half
        }
        }

             return -1;

        }
        public static void main(String[]args){
            String [] c = new String[]{"i","love","tea","and","coffee"};
           Arrays.sort(c);
            int result = binarySearch(c,"tea", 0,c.length-1);
            System.out.println("The index of your element is " + result  );


        }
       
        }
    
