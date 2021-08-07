import java.util.Arrays;

public class SortedSquaredArray {
    // Solution 1 - O(nlogn)
   /* public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.

        for(int i = 0;i<array.length;i++){
            array[i] = array[i]*array[i];
        }
         Arrays.sort(array);
        return array;
    }*/
// Solution 2- optimised one - O(n)
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] sortedSquareArr=new int[array.length];
        int smallerIndex=0;
        int largerIndex= array.length-1;

        for(int i=sortedSquareArr.length-1;i>=0;i--){
            int smallerIndexValue= Math.abs(array[smallerIndex]);
            int largerIndexValue= Math.abs(array[largerIndex]);

            if(largerIndexValue>smallerIndexValue){
                sortedSquareArr[i]= largerIndexValue*largerIndexValue;
                largerIndex--;
            } else {
                sortedSquareArr[i] = smallerIndexValue*smallerIndexValue;
                smallerIndex++;
            }
        }

        return sortedSquareArr;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(SortedSquaredArray.sortedSquaredArray(new int[]{1,2,3,5})));
        System.out.println(Arrays.toString(SortedSquaredArray.sortedSquaredArray(new int[]{-2, 1, 5})));
    }
}
