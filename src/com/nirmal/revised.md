- [x] [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * two solution are there 1. using stack with O(M+N) space , 2.using while loop with O(1)
    * iterate over string ->toCharArray() -> if !='#' insert into stack else stack.pop()
    * at the end compare two stacks ->if equals return true;
    * In Second approach create two pointers from end of strings and check

- [x] [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)
  ➡ [Reference](https://www.youtube.com/watch?v=-1jxt_DPl48)
    * its a game of max heap,add all stones maxheap(in java new PriorityQueue<>(Comparator.reverseOrder()))
    * Run a while loop till heap size>1 , fetch top two weights and if both weight are not equal then add difference to
      heap
    * if heap.isEmpty() return 0 , else return heap.remove()

- [x] [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * Same as [Algo expert - Validate Subsequence](https://www.algoexpert.io/questions/Validate%20Subsequence)
    * in while  (sequenceIdx<sequence.size() && arrIdx < array.size()
    * if (sequence.get(seqIdx) == array.get(arrIdx)) then seqIdx++
    * arrIdx++; at the end return seqIdx==sequence.size();

- [x] [792. Number of Matching Subsequences](https://leetcode.com/problems/number-of-matching-subsequences/)
    * to params given 1. String[] words and 2. String match
    * for(String word:words) check if word.IsSubsequecne.OF(match) the count ++
    * to check word is subsequence of match for(char c:word.toCharArray) int index= match.indexOf(c);
    * if(index==-1) return false else index= index+1; and at the end return true

- [x] [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * Same as [Algo expert - Sorted Squared Array](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * tricky parts is when array is [-9,2,4,6]. so two with pointers it can be solved. int
      smallerIdx=0,largerIdx=length-1
    * for(int i=length-1;i>=0;i--) if(Math.abs(valueAtSIndex) > valueAtLIndex) then result[i]=valueAtSIndex * valueAtSIndex ;
      smallerIdx++
    * else arr[i]=valueAtLIndex * valueAtLIndex; largerIdx--;

- [x] [99.RecoverBinarySearchTree](https://leetcode.com/problems/recover-binary-search-tree/)
  ➡ [Reference](https://www.youtube.com/watch?v=ZWGW7FminDM)
  * four variables prev=Integer.MIN_VALUE,first=middle=last=null
  * if adjacent node then fist and middle , if distance node then first and last
  * Do inorder ,while doing find if current is smaller than prev
  * if yes- then store in first=prev and middle=current and cont.
  * again if current<prev then last=current
  * then at the end swap first and last OR first and middle

- [x] [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)
  * Its basically search-> So that leeds to binary search
  * do binary search and if match found return middle
  * else at the end of while loop return L

- [x] [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)
  ➡ [Reference](https://www.youtube.com/watch?v=f_F9ItFyiEg)
  * create num array and add all numbers respective to roman string to it(add 10 for X) in ascending order
  * Create String array and all roman strings . Note both int array and string array should be in descending order
  * iterate through num array and in while loop check if input number >= numArray[i] then add stringArray[i] to
    stringBuilder
  * and make num=num-numArray[i]

- [x] [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
  ➡ [Reference](https://www.youtube.com/watch?v=dlATMslQ6Uc)
  * create a map <Character,Integer> and put all roman char and respective numbers as value.
  * iterate the input strings from last char and check id number for charAt(i) < number for charAt(i+1)
  * then subtract charAt(i) number from result else add charAt(i) + result number

- [x] [1641. Count Sorted Vowel Strings](https://leetcode.com/problems/count-sorted-vowel-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=IEIeC0b02HA)
  * it is equals to levenstein distance problem.
 ```
     int[][] count = new int[n + 1][6];
        for (int i = 1; i < count.length; i++) {
            for (int j = 1; j < count[0].length; j++) {
                if (i == 1) { count[i][j] = j;
                } else { count[i][j] = count[i - 1][j] + count[i][j - 1];
                
        return count[n][5];
``` 
- [x] [Monotonic Array](https://www.algoexpert.io/questions/Monotonic%20Array)
  * With two boolean variable isIncreasingOrder=true , isInDecreasingOrder=true it can be done
  * Either arr[i]< arr[i+1] always(then isInDecreasingOrder=false;) OR arr[i]> arr[i+1] always (then
    isIncreasingOrder=false)
  * and return isIncreasingOrder || isInDecreasingOrder;

- [x] [Move Element To End](https://www.algoexpert.io/questions/Move%20Element%20To%20End)
  * Can be done with two pointer L ,R while(L<R);
  * in nested while(L<R && array.get(R) == elementToBeMoved) R--;
  * then if(array.get(L) == toMove) swap (L,R) and L++;

- [x] [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=GSJuwQzKSnI)
  * You have two pointer in between which you need to reverse. left and right
  * iterate(while left>1) and reach at left and then currentNode= left pointer node and prevNode=left-1 pointer node;
    left--; right--
  * in above loop right-- is required because while reversing you will require right in while loop.
  * now connectionNode=prevNode and tailNode=currentNode
  * Now do reverse linked list logic till right>0 and also do right--
  * at the end connectionNode.next=prev and tail.next=currentNode and return head
