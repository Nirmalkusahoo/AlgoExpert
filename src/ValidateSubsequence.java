import java.util.*;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
      int arrIdx=0;
      int seqIdx=0;

      while(arrIdx<array.size() && seqIdx<sequence.size()){
          if(array.get(arrIdx) == sequence.get(seqIdx)){
              seqIdx++;
          }
          arrIdx++;
      }
      return seqIdx == sequence.size();
    }
    // Solution 2 - Not working
   /* public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx=0;
        for(int value:array){
            if(seqIdx == sequence.size()){
                break;
            }
            if(array.get(value).equals(sequence.get(seqIdx)) ){
                seqIdx++;
            }
        }

        return seqIdx == sequence.size();
    }*/


    public static void main(String[] args) {
        List<Integer> parent = new ArrayList<Integer>();
        parent.add(5);
        parent.add(1);
        parent.add(22);
        parent.add(10);

        List<Integer> child = new ArrayList<Integer>();
        child.add(5);
        child.add(10);
        System.out.println(parent);
        System.out.println(child);
        System.out.println("isValidSubsequence ::" +ValidateSubsequence.isValidSubsequence(parent,child));;
    }
}
